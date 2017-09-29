package be.occam.acsi.web.dto;

import static be.occam.utils.javax.Utils.*;
import java.util.List;

public class PageDTO {
	
	protected final List<ArticleDTO> articles;
	
	public PageDTO() {
		this.articles = list();
	}

	public List<ArticleDTO> getArticles() {
		return articles;
	}
	
}
