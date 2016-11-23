package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import standort.*;

@Configuration
@Import({AppConfigJpa.class,AppConfigHibernate.class})
public class AppConfig {

	@Autowired
	DataSource dataSource;
		
	@Bean
	public StandortRepository standortRepository(){
		return new JdbcStandortRepository(dataSource);
	}
	

}
