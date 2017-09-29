package be.occam.acsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ArticleRepository extends JpaRepository<ArticleEntity, String>{
	
	public ArticleEntity findOneByUuid( String uuid );
	public ArticleEntity findOneByIdAndVersion( String id, String version );
	
	public List<ArticleEntity> findByPage( String page );

}
