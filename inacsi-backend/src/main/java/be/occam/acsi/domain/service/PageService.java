package be.occam.acsi.domain.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.domain.people.ArticleManager;
import be.occam.acsi.domain.people.Publisher;
import be.occam.acsi.domain.people.Reader;
import be.occam.acsi.web.dto.ArticleDTO;
import be.occam.acsi.web.dto.PageDTO;

public class PageService extends Service<PageService> {
	
	@Resource
	ArticleManager articleManager;
	
	@Resource
	Reader reader;
	
	@Resource
	Publisher publisher;
	
	@Transactional( readOnly=true )
	public PageDTO retrieve( String page ) {
		
		PageDTO pageDTO
			= new PageDTO();
		
		List<Article> articles
			= this.articleManager.findLatestByPage( page );
		
		for ( Article article : articles ) {
			
			ArticleDTO dto
				= ArticleDTO.dto( article );
			
			pageDTO.getArticles().put( dto.getId(), dto );
			
		}
		
		return pageDTO;
		
	} 
	
	@Transactional( readOnly=true )
	public void publish( String page, String version ) {
		
		String html
			= this.reader.readPage( page );
		
		if ( html != null ) {
			
			this.publisher.publish( String.format( "%s.html", page ), html );
			
			logger.info( "published page [{}]", page );
			
		}
		
	}
	
}
