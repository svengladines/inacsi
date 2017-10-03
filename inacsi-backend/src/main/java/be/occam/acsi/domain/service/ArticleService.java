package be.occam.acsi.domain.service;

import static be.occam.utils.spring.web.Controller.response;

import java.util.List;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.domain.object.Entry;
import be.occam.acsi.domain.people.ArticleManager;
import be.occam.acsi.domain.people.Mapper;
import be.occam.acsi.web.controller.ArticlesController;
import be.occam.acsi.web.dto.ArticleDTO;
import be.occam.acsi.web.dto.PageDTO;
import be.occam.acsi.web.util.DataGuard;

public class ArticleService extends Service<ArticleService> {
	
	@Resource
	ArticleManager articleManager;
	
	@Transactional( readOnly = false )
	public ArticleDTO consume( ArticleDTO articleDTO ) {
		
		String articleID
			= articleDTO.getId();
		
		logger.info( "consume [{}]", articleDTO );
		
		List<Article> articles
			= this.articleManager.findLatestByID( articleID );
		
		if ( ! articles.isEmpty() ) {
			
			Article article
				= Mapper.article( articleDTO );
			
			article.setPage( article.getPage() );
			article.setVersion( System.currentTimeMillis() );
			
			article = this.articleManager.update( article );
			
			logger.info( "article [{}] updated to version [{}], new text = [{}]", article.getId(), article.getVersion(), article.getText() );
			
			// TODO: back to dto...
			
		}
		else {
			logger.warn( "article [{}], no initial version found, not updated", articleID );
		}
		return articleDTO;
		
	}
	
}
