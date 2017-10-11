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
	public ArticleDTO findOne( String id, String version ) {
		
		String articleID
			= id;
		
		ArticleDTO articleDTO
			= null;
		
		logger.info( "findOne [{}]", articleDTO );
		
		if ( "latest".equals( version ) ) {
			
			List<Article> articles
				= this.articleManager.findLatestByID( articleID );
		
			if ( ! articles.isEmpty() ) {
				
				Article article
					= articles.get( 0 );
				
				articleDTO = Mapper.dto( article );
				
			}
			
		}
		else {
			// TODO, match version
		}
		
		return articleDTO;
		
	}
	
	@Transactional( readOnly = false )
	public ArticleDTO consume( ArticleDTO articleDTO ) {
		
		String articleID
			= articleDTO.getId();
		
		logger.info( "consume [{}]", articleDTO );
		
		List<Article> articles
			= this.articleManager.findLatestByID( articleID );
		
		if ( ! articles.isEmpty() ) {
			
			Article toUpdate
				= articles.get( 0 );
			
			toUpdate.setVersion( System.currentTimeMillis() );
			toUpdate.setText( articleDTO.getText() );
			
			logger.info( "article [{}], on page [{}], update to version [{}], new text = [{}]", toUpdate.getId(), toUpdate.getPage(), toUpdate.getVersion(), toUpdate.getText() );
			
			Article updated = this.articleManager.update( toUpdate );
			
			logger.info( "article [{}] updated to version [{}], new text = [{}]", updated.getId(), updated.getVersion(), updated.getText() );
			
			// TODO: back to dto...
			
		}
		else if ( articleDTO.getVersion() == 1L ) {
			
			Article toUpdate
				= Mapper.article( articleDTO );
			
			logger.info( "article [{}], on page [{}], initial version, text = [{}]", toUpdate.getId(), toUpdate.getPage(), toUpdate.getVersion(), toUpdate.getText() );
			
			Article updated = this.articleManager.create( toUpdate );
			
			logger.info( "article [{}], on page [{}], initial version, text = [{}]", updated.getId(), updated.getPage(), updated.getVersion(), updated.getText() );
			
		}
		else {
			logger.warn( "article [{}], no initial version found, not updated", articleID );
		}
		return articleDTO;
		
	}
	
}
