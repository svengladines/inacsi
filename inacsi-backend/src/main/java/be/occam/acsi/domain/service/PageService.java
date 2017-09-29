package be.occam.acsi.domain.service;

import java.util.List;

import javax.annotation.Resource;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.domain.people.ArticleManager;
import be.occam.acsi.web.dto.ArticleDTO;
import be.occam.acsi.web.dto.PageDTO;

public class PageService {
	
	@Resource
	ArticleManager articleManager;
	
	public PageDTO retrieve( String page ) {
		
		PageDTO pageDTO
			= new PageDTO();
		
		List<Article> articles
			= this.articleManager.findLatestByPage( page );
		
		for ( Article article : articles ) {
			
			ArticleDTO dto
				= ArticleDTO.dto( article );
			
			pageDTO.getArticles().add( dto );
			
		}
		
		return pageDTO;
		
	} 

}
