package be.occam.acsi.web.controller;

import static be.occam.utils.spring.web.Controller.response;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import be.occam.acsi.domain.service.ArticleService;
import be.occam.acsi.web.dto.ArticleDTO;
import be.occam.acsi.web.dto.PageDTO;

@Controller
@RequestMapping(value="/articles/{id}/versions/{version}")
public class ArticleController {
	
	private final Logger logger 
		= LoggerFactory.getLogger( ArticleController.class );
	
	@Resource
	ArticleService articleService;
	
	@RequestMapping( method = { RequestMethod.GET }, produces = { MediaType.APPLICATION_JSON_VALUE } )
	public ResponseEntity<ArticleDTO> get( @PathVariable String id, @PathVariable String version ) {
		
		logger.info( "GET request received for article [{}], version [{}]", id, version );
		
		ArticleDTO articleDTO
			= this.articleService.guard().findOne( id, version );
		
		return response( articleDTO, HttpStatus.OK );

}

	@RequestMapping( value="/**", method = { RequestMethod.OPTIONS } )
	@ResponseBody
	public ResponseEntity<String> options() {

		logger.info( "options!" );
	
		HttpHeaders httpHeaders
			= new HttpHeaders();
		
		httpHeaders.add("Access-Control-Allow-Origin", "*" ) ;
		httpHeaders.add("Access-Control-Allow-Methods", "GET,OPTIONS,POST" );
		httpHeaders.add("Access-Control-Allow-Credentials","true");
		httpHeaders.add("Access-Control-Allow-Headers","Content-Type");
		
		ResponseEntity<String> response;
		
		response = new ResponseEntity<String>( "okelidokeli", httpHeaders, HttpStatus.OK );
		
		return response;
	}


	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleServiceException(IllegalArgumentException e, WebRequest webRequest ) {
		logger.warn("server error", e);
		return response( e.getMessage(), HttpStatus.BAD_REQUEST );
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleServiceException(Exception e, WebRequest webRequest ) {
		logger.warn("server error", e);
		return response( e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR );
	}
	
}
