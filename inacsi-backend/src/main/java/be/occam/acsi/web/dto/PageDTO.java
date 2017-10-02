package be.occam.acsi.web.dto;

import static be.occam.utils.javax.Utils.*;
import java.util.List;
import java.util.Map;

public class PageDTO {
	
	protected final Map<String,ArticleDTO> articles;
	
	public PageDTO() {
		this.articles = map();
	}

	public Map<String,ArticleDTO> getArticles() {
		return articles;
	}
	
}
