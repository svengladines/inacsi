package be.occam.acsi.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.google.apphosting.api.ApiProxy;

import be.occam.acsi.web.util.DataGuard;
import be.occam.acsi.web.util.DevGuard;
import be.occam.utils.spring.configuration.ConfigurationProfiles;

@Configuration
public class InAcsiApplicationConfigForDev {
	
	// TODO move to cntsnts
	final static String JPA_PKG 
		= "be.occam.acsi.repository";
	
	@Profile( { ConfigurationProfiles.DEV } )
	public static class ConfigForDev {
		
		@Bean
		String acsiEmailAddress() {
			
			return "sven.gladines@gmail.com"; 
			
		}
		
	}
	
	@Configuration
	@Profile( { ConfigurationProfiles.DEV } ) 
	public static class ConfigForDevelopment {
		
		@Bean
		DataGuard dataGuard( LocalServiceTestHelper helper ) {
			
			return new DevGuard( ApiProxy.getCurrentEnvironment() );
			
		}
		
	}
	
}