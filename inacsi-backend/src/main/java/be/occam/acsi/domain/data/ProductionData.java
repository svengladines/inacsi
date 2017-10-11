package be.occam.acsi.domain.data;

import static be.occam.utils.javax.Utils.map;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import be.occam.acsi.domain.service.ArticleService;
import be.occam.acsi.web.dto.ArticleDTO;

public class ProductionData {
	
	protected final Logger logger
		= LoggerFactory.getLogger( this.getClass() );
	
	@Resource
	protected ArticleService articleService;
	
	@PostConstruct
	public void defaultArticles() {
		
		Map<String,ClassPathResource> defaultArticles
			= map();
		
		defaultArticles.put( "entry" , new ClassPathResource( "articles/entry.html" ) );
		
		for ( String articleID : defaultArticles.keySet() ) {
			
			ArticleDTO found
				= this.articleService.findOne(  articleID , "latest" );
			
			if ( found == null ) {
				
				try {
					ClassPathResource resource
						= defaultArticles.get( articleID );
					
					InputStream is
						= resource.getInputStream();
					
					ByteArrayOutputStream bis
						= new ByteArrayOutputStream( 1024 );
					
					int bt;
					while ( ( bt = is.read() ) != -1 ) {
						bis.write( bt );
					}
					
					String text
						= bis.toString( "utf-8" );
					
					ArticleDTO newArticle
						= new ArticleDTO();
					
					newArticle.setId( articleID );
					newArticle.setText( text );
					newArticle.setVersion( 1L );
					newArticle.setPage( "index" );
					
					this.articleService.consume( newArticle );
					
					logger.info( "article [{}], saved default text [{}]", newArticle.getId(), newArticle.getText() );
					
				} catch ( Exception e ) {
					logger.warn( "failed to read article default text", e );
				}
				
				
			}
			
		}
		
			
		
	}
	

}
