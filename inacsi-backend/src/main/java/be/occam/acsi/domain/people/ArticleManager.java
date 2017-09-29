package be.occam.acsi.domain.people;

import static be.occam.utils.javax.Utils.*;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.repository.ArticleEntity;
import be.occam.acsi.repository.ArticleRepository;

public class ArticleManager {
	
	@Resource
	ArticleRepository articleRepository;
	
	public List<Article> findLatestByPage( String page ) {
		
		List<Article> articles
			= list();
		
		List<ArticleEntity> allByPage
			= this.articleRepository.findByPage( page );
		
		Map<String,Article> mapped
			= map();
		
		for ( ArticleEntity entity : allByPage ) {
			
			String id
				= entity.getId();
			
			Article found
				= mapped.get( id );
			
			Article article
				= ArticleEntity.article( entity );
			
			if ( found == null ) {
				
				mapped.put( id, article );
				
			}
			else if ( article.getVersion() > found.getVersion() ) {
					mapped.put( id, article );
				
			}
			else {
				// this version was older ...
			}
			
		}
		
		articles.addAll( mapped.values() );
		
		return articles;
		
		
	}

}
