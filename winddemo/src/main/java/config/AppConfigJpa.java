package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import standort.StandortRepository;
import wind.internal.standort.JpaStandortRepository;

@Configuration
@Profile({"jpa","jpa-elink"})
public class AppConfigJpa {

	
	@Bean
	public StandortRepository standortRepository(){
		return new JpaStandortRepository();
	}
	

}
