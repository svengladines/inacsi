package be.occam.acsi.domain.people;

import static be.occam.utils.javax.Utils.list;
import static be.occam.utils.javax.Utils.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.repository.ArticleEntity;
import be.occam.acsi.repository.ArticleRepository;

public class ArticleManager {
	
	private final Comparator<Article> latest = new Comparator<Article> () {

		@Override
		public int compare(Article o1, Article o2) {
			
			return 0 - ( o1.getVersion().compareTo( o2.getVersion() ) ); 
			
		}
		
	};
	
	@Resource
	ArticleRepository articleRepository;
	
	public List<Article> findLatestByID( String id ) {
		
		List<Article> articles
			= list();
		
		List<ArticleEntity> byID
			= this.articleRepository.findById( id );
		
		for ( ArticleEntity entity : byID ) {
			
			articles.add( Mapper.article( entity ) );
			
		}
		
		Collections.sort( articles, this.latest );		
		
		return articles;
		
		
}
	
	public List<Article> findLatestByPage( String page ) {
		
		List<Article> articles
			= list();
		
		List<ArticleEntity> byPage
			= this.articleRepository.findByPage( page );
		
		List<Article> temporary
			= list();
		
		for ( ArticleEntity entity : byPage ) {
			
			temporary.add( Mapper.article( entity ) );
			
		}
	
		Map<String,Article> mapped
			= map();
		
		for ( Article loaded : temporary ) {
			
			String id
				= loaded.getId();
			
			Article fromMap
				= mapped.get( id );
			
			if ( fromMap == null ) {
				
				mapped.put( id, loaded );
				
			}
			else if ( loaded.getVersion() > fromMap.getVersion() ) {
				mapped.put( id, loaded );
			}
			else {
				// this version was older ...
			}
			
		}
		
		articles.addAll( mapped.values() );
		
		return articles;
		
		
	}
	
	public Article update( Article article ) {
		
		Article updated
			= null;
		
		String articleID
			= article.getId();
		
		List<Article> previousVersions
			= this.findLatestByID( articleID );
		
		if ( ! previousVersions.isEmpty() ) {
			
			Article previous
				= previousVersions.get( 0 );
			
			if ( article.getVersion() > previous.getVersion() ) {
				
				ArticleEntity entity
					= Mapper.entity( article );
				
				entity = this.articleRepository.saveAndFlush( entity );
				updated = Mapper.article( entity );
			}
			else {
				throw new RuntimeException( String.format("article [%s], version to store [%s] was not more recent than db-version [%s]", articleID, article.getVersion(), previous.getVersion() ) );
			}
			
		}
		
		return updated;
		
	}

}
