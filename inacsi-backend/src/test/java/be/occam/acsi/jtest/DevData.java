package be.occam.acsi.jtest;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import be.occam.acsi.repository.ArticleEntity;
import be.occam.acsi.repository.ArticleRepository;

public class DevData {
	
	public static class Ids {
		
		public static final String pageIndex = "index";
		public static final String articleOne = "belmans-cover";  
		
	}
	
	@Resource
	ArticleRepository articleRepository;
	
	@PostConstruct
	@Transactional( readOnly=false )
	public void inject() {
		
		ArticleEntity indexArticleOne
			= new ArticleEntity();
		
		indexArticleOne.setId( Ids.articleOne );
		indexArticleOne.setVersion( 1L );
		indexArticleOne.setPage( Ids.pageIndex );
		indexArticleOne.setText( "Belmans Cover Text");
		
		this.articleRepository.saveAndFlush( indexArticleOne );
		
		
	}

}
