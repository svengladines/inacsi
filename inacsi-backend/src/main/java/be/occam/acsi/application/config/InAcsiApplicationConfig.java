package be.occam.acsi.application.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import be.occam.acsi.domain.people.MailMan;
import be.occam.acsi.domain.people.Secretary;
import be.occam.acsi.domain.service.EntryService;
import be.occam.acsi.web.util.DataGuard;
import be.occam.acsi.web.util.NoopGuard;
import be.occam.utils.spring.configuration.ConfigurationProfiles;

@Configuration
public class InAcsiApplicationConfig {
	
	final static Logger logger
		= LoggerFactory.getLogger( InAcsiApplicationConfig.class );

	final static String BASE_PKG 
		= "be.occam.acsi";
	
	static class propertiesConfigurer {
		
		@Bean
		@Scope("singleton")
		public static PropertySourcesPlaceholderConfigurer propertiesConfig() {
			return new PropertySourcesPlaceholderConfigurer();
		}
		
	}
	
	@Configuration
	@Profile({ConfigurationProfiles.PRODUCTION})
	static class DomainConfigForProduction {
		
		@Bean
		DataGuard dataGuard() {
			
			return new NoopGuard();
			
		}
		
		@Bean
		String acsiEmailAddress() {
			
			return "info@inacsi.be"; 
			
		}
		
		@Bean
		String acsiDigitaalEmailAddress() {
			
			return "acsi.digitaal@gmail.com"; 
			
		}
		
	}
	
	@Configuration
	public static class ServiceConfigShared {
		
		@Bean
		public JavaMailSender javaMailSender () {
			
			JavaMailSenderImpl sender
				= new JavaMailSenderImpl();
			return sender;
			
		}
		
		@Bean
		public EntryService entryService( String acsiDigitaalEmailAddress, String acsiEmailAddress ) {
			return new EntryService( acsiDigitaalEmailAddress, acsiEmailAddress );
		}
		
		/*
		@Bean
		public PageService pageService( ) {
			return new PageService(  );
		}
		
		@Bean
		public ArticleService articleService() {
			return new ArticleService();
		}
		*/
		
	}
	
	@Configuration
	public static class PeopleConfigShared {
		
		@Bean
		public MailMan mailMan() {
			return new MailMan();
		}
		
		@Bean
		public Secretary secretary() {
			return new Secretary();
		}
		
		/*
		@Bean
		ArticleManager articleManager() {
			return new ArticleManager();
		}
		*/
	}
	
	@Configuration
	@Profile({ConfigurationProfiles.PRODUCTION, ConfigurationProfiles.DEV})
	public static class DataConfig {
		
		/*
		@Bean
		@Lazy( false )
		public ProductionData productionData() {
			return new ProductionData();
		}
		*/
		
	}
	
		
}