package be.occam.acsi.domain.people;

import static be.occam.utils.spring.web.Client.*;

import org.springframework.http.ResponseEntity;

public class Reader {
	
	protected String baseURL;
	
	public Reader( String baseURL ) {
		
		this.baseURL = baseURL;
		
	}
	
	public String readPage( String pageID ) {
		
		String url
			= new StringBuilder( this.baseURL ).append( pageID ).append( ".html" ).toString();
		
		ResponseEntity<String> readResponse
			= getHTML( url );
		
		String html
			= readResponse.getBody();
		
		return html;
		
	}

}
