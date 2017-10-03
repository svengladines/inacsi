package be.occam.acsi.domain.people;

import be.occam.acsi.domain.object.Article;
import be.occam.acsi.repository.ArticleEntity;
import be.occam.acsi.web.dto.ArticleDTO;

public class Mapper {
	
public static Article article( ArticleEntity f ) {
		
		Article t
			= new Article();
		t.setId( f.getId() );
		t.setTitle( f.getTitle() );
		t.setText( f.getText() );
		t.setVersion( f.getVersion() );
		
		return t;
	
		
	}

	public static Article article( ArticleDTO f ) {
		
		Article t
			= new Article();
		t.setId( f.getId() );
		t.setTitle( f.getTitle() );
		t.setText( f.getText() );
		t.setVersion( f.getVersion() );
		
		return t;
	
		
	}
	
	public static ArticleEntity entity( Article f ) {
		
		ArticleEntity t
			= new ArticleEntity();
		
		t.setId( f.getId() );
		t.setTitle( f.getTitle() );
		t.setText( f.getText() );
		t.setVersion( f.getVersion() );
		
		return t;
	
		
	}

}
