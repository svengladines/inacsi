package be.occam.acsi.domain.object;

import static be.occam.utils.javax.Utils.*;
import java.util.Map;

public class Article {
	
	protected String id;
	protected String title;
	protected String text;
	protected Long version;
	protected String page;
	
	public Article() {
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}
