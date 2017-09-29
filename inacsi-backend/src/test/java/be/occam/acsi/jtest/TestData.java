package be.occam.acsi.jtest;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import be.occam.acsi.repository.ArticleEntity;
import be.occam.acsi.repository.ArticleRepository;

public class TestData {
	
	public static class Ids {
		
		public static final String pageIndex = "page-index";
		public static final String articleOne = "article-one";  
		
	}
	
	@Resource
	ArticleRepository articleRepository;
	
	@PostConstruct
	public void inject() {
		
		ArticleEntity indexArticleOne
			= new ArticleEntity();
		
		indexArticleOne.setId( Ids.pageIndex );
		indexArticleOne.setVersion( 1L );
		indexArticleOne.setPage( Ids.articleOne );
		
		this.articleRepository.saveAndFlush( indexArticleOne );
		
		
	}

}
