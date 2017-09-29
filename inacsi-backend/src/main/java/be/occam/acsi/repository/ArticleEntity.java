package be.occam.acsi.repository;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

import be.occam.acsi.domain.object.Article;

@Entity
@Cacheable(value=false)
public class ArticleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Key key;

	protected String uuid;
	protected String title;
	protected String text;
	protected String id;
	protected String page;
	protected Long version;
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	public static Article article( ArticleEntity f ) {
		
		Article t
			= new Article();
		t.setId( f.getId() );
		t.setTitle( f.getTitle() );
		t.setText( f.getText() );
		t.setVersion( f.getVersion() );
		
		return t;
	
		
	}
	
}
