package be.occam.acsi.jtest.scenario;

import static be.occam.utils.spring.web.Client.postJSON;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import be.occam.acsi.jtest.DevData;
import be.occam.acsi.jtest.DevData.Ids;
import be.occam.acsi.web.dto.ArticleDTO;
import be.occam.test.jtest.JTest;
import be.occam.utils.spring.configuration.ConfigurationProfiles;
import be.occam.utils.spring.web.Client;

public class TestBuildPageScenario extends JTest {
	
	public TestBuildPageScenario() {
		super( "", 8099, ConfigurationProfiles.DEV );
	}
	
	protected final Logger logger 
		= LoggerFactory.getLogger( this.getClass() );
	
	@Test
	public void doesItSmoke() {
		
		String articleID
			= DevData.Ids.articleOne;
		
		String updatedText
			= "boowyeah";
		
		String url
			= this.baseAPIURL().append( "/articles" ).toString();
		
		ArticleDTO article
		
			= new ArticleDTO();
		article.setId( articleID );
		article.setText( updatedText );
		
		ResponseEntity<ArticleDTO> postResponse
			= postJSON( url, article );
		
		assertEquals( HttpStatus.OK, postResponse.getStatusCode() );
		
		String pageUrl
			= this.baseUrl().append( "/page.html?page=" ).append( Ids.pageIndex ).toString();
		
		ResponseEntity<String> pageResponse
			= Client.getHTML( pageUrl );
		
		// logger.info( "new page is [{}]", page );
		
		assertTrue ( pageResponse.getBody().indexOf( updatedText ) != -1 ); 
		
	}

}
