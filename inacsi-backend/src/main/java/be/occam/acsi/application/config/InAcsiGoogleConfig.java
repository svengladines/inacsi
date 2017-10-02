package be.occam.acsi.application.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;

import org.datanucleus.api.jpa.PersistenceProviderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import be.occam.utils.spring.configuration.ConfigurationProfiles;

@Configuration
@Profile(ConfigurationProfiles.PRODUCTION)
public class InAcsiGoogleConfig {
	
	final static String JPA_PKG = "be.occam.acsi.repository";
	
	@Configuration
	@EnableTransactionManagement
	static class DomainConfigShared {
		
	}
	
	@Configuration
	@Profile(ConfigurationProfiles.PRODUCTION)
	@EnableJpaRepositories(JPA_PKG)
	static class EntityManagerConfig {
		
		@Bean
		public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(PersistenceProvider persistenceProvider ) {
			
			LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
			factory.setPackagesToScan( JPA_PKG);
			factory.setPersistenceProvider( persistenceProvider );
			// factory.setDataSource(jpaDataSource);
			factory.setPersistenceUnitName("vive-le-velo-repository");
			factory.getJpaPropertyMap().put( "datanucleus.jpa.addClassTransformer", "false" );
			factory.getJpaPropertyMap().put( "datanucleus.appengine.datastoreEnableXGTransactions", "true" );
			factory.getJpaPropertyMap().put( "datanucleus.metadata.allowXML", "false" );
			factory.afterPropertiesSet();
			return factory;
			
		}
		
		@Bean
		PersistenceProvider persistenceProvider() {
			
			PersistenceProviderImpl provider
				= new PersistenceProviderImpl();
			
			return provider;
			
		}

		@Bean
		public EntityManagerFactory entityManagerFactory(LocalContainerEntityManagerFactoryBean factory) {
			return factory.getObject();
		}

		@Bean
		public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
			return new PersistenceExceptionTranslationPostProcessor();
		}

		@Bean
		public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
			JpaTransactionManager transactionManager = new JpaTransactionManager();
			transactionManager.setEntityManagerFactory(entityManagerFactory);
			return transactionManager;
		}
		
	}
	
}
