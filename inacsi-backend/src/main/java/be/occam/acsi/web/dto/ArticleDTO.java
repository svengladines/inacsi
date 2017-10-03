package be.occam.acsi.web.dto;

import be.occam.acsi.domain.object.Article;

public class ArticleDTO {
	
	protected String id;
	protected String title;
	protected String text;
	protected Long version;
	protected String page;
	
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
	
	public static ArticleDTO dto( Article f ) {
		
		ArticleDTO t
			= new ArticleDTO();
		
		t.setId( f.getId() );
		t.setTitle( f.getTitle() );
		t.setText( f.getText() );
		t.setVersion( f.getVersion() );
		t.setPage( f.getPage() );
		
		return t;
		
	}
	
}
