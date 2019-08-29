package be.occam.acsi.domain.service;

import static be.occam.utils.javax.Utils.list;
import static be.occam.utils.spring.web.Controller.response;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import be.occam.acsi.domain.object.Entry;
import be.occam.acsi.domain.people.MailMan;
import be.occam.acsi.domain.people.Secretary;
import be.occam.acsi.web.dto.EntryDTO;
import be.occam.utils.timing.Timing;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class EntryService {
	
	protected final Logger logger
		= LoggerFactory.getLogger( this.getClass() );
	
	protected final String[] days
		= new String [] { "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag" };
	
	protected final String[] dayParts
		= new String [] { "voormiddag", "namiddag", "avond" };
	
	@Resource
	protected JavaMailSender javaMailSender;
	
	@Resource
	protected MailMan mailMan;
	
	@Resource
	protected Secretary secretary;
	
	protected final String fromEmailAddress;
	protected final String toEmailAddress;
	
	public EntryService( String fromEmailAddress, String toEmailAddress ) {
		this.fromEmailAddress = fromEmailAddress;
		this.toEmailAddress = toEmailAddress;
		
		logger.info( "entry service started, from-email address is [{}], to-email address is [{}]", fromEmailAddress, toEmailAddress );
	}
	
	public ResponseEntity<EntryDTO> accept( EntryDTO entryDTO) {
		
		logger.info( "accept [{}]", entryDTO );
		
		Entry entry
			= EntryDTO.toEntry( entryDTO );
		
		entry.getAvailabilities().addAll( this.translatedAvailabilities( entryDTO.getAvailabilities() ) );
		entry.setPreferredTherapist( this.secretary.whoHasCode( entryDTO.getPreferredTherapist() ) );
		
		MimeMessage message
			= this.formatEntryReceivedMessage( entry, this.toEmailAddress );
		
		this.mailMan.deliver( message );
		
		MimeMessage messageForSven
			= this.formatEntryReceivedForSvenMessage( entry, "sven.gladines@gmail.com" );
		
		this.mailMan.deliver( messageForSven );
		
		return response( entryDTO, HttpStatus.CREATED );
			
	}
	
	protected List<String> translatedAvailabilities( String[] inSet ) {
		
		List<String> translated
			= list();
	
		for ( String in : inSet ) {
			
			StringBuilder b
				= new StringBuilder();
			
			Integer dayIndex 
				= Integer.valueOf( in.substring( 0, 1 ) ) -1 ;
			
			b.append( days[ dayIndex ] );
			
			Integer dayPartIndex 
				= Integer.valueOf( in.substring( 1, 2 ) ) -1 ;
		
			b.append( dayParts[ dayPartIndex ] );
			
			translated.add( b.toString() );
			
		}
		
		return translated;
	}
	
	protected MimeMessage formatEntryReceivedMessage( Entry entry, String... recipients ) {
		
		MimeMessage message
			= null;
			
		Configuration cfg 
			= new Configuration();
		
		String templateID
			= "/templates/to-acsi/entry-received.tmpl";
		
		try {
			
			InputStream tis
				= this.getClass().getResourceAsStream( templateID );
			
			Template template 
				= new Template( templateID, new InputStreamReader( tis ), cfg );
			
			Map<String, Object> model = new HashMap<String, Object>();
					
			model.put( "entry", entry );
			
			StringWriter bodyWriter 
				= new StringWriter();
			
			template.process( model , bodyWriter );
			
			bodyWriter.flush();
				
			message = this.javaMailSender.createMimeMessage( );
			// SGL| GAE does not support multipart_mode_mixed_related (default, when flag true is set)
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_NO, "utf-8");
				
			helper.setFrom( this.fromEmailAddress );
			helper.setTo( recipients );
			helper.setSubject( String.format( "Nieuwe aanmelding: %s", entry.getName() ) );
				
			String text
				= bodyWriter.toString();
				
			logger.info( "email text is [{}]", text );
				
			helper.setText(text, true);
			
		}
		catch( Exception e ) {
			logger.warn( "could not create e-mail", e );
			throw new RuntimeException( e );
		}
		
		return message;
    	
    }
	
	protected MimeMessage formatEntryReceivedForSvenMessage( Entry entry, String... recipients ) {
		
		MimeMessage message
			= null;
			
		Configuration cfg 
			= new Configuration();
		cfg.setTimeZone(Timing.timeZone);
		
		String templateID
			= "/templates/to-sven/entry-received.tmpl";
		
		try {
			
			InputStream tis
				= this.getClass().getResourceAsStream( templateID );
			
			Template template 
				= new Template( templateID, new InputStreamReader( tis ), cfg );
			
			Map<String, Object> model = new HashMap<String, Object>();
					
			model.put( "entry", entry );
			
			StringWriter bodyWriter 
				= new StringWriter();
			
			template.process( model , bodyWriter );
			
			bodyWriter.flush();
				
			message = this.javaMailSender.createMimeMessage( );
			// SGL| GAE does not support multipart_mode_mixed_related (default, when flag true is set)
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_NO, "utf-8");
				
			helper.setFrom( this.fromEmailAddress );
			helper.setTo( recipients );
			helper.setSubject( String.format( "Nieuwe aanmelding: %s ...", entry.getName().substring( 0, 3 ) ) );
				
			String text
				= bodyWriter.toString();
				
			logger.info( "email text is [{}]", text );
				
			helper.setText(text, true);
			
		}
		catch( Exception e ) {
			logger.warn( "could not create e-mail", e );
			throw new RuntimeException( e );
		}
		
		return message;
    	
    }

}
