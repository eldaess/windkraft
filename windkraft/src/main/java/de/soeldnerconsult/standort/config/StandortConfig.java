package de.soeldnerconsult.standort.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import de.soeldnerconsult.standort.*;

//	TODO-06: Add the annotation that will Enable Automatic JPA repositories. 
//	Note that this configuration class is not in the same base package as the
//	interfaces annotated in the previous steps.

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="standort")
public class StandortConfig {

	@Autowired
	DataSource dataSource;
	
}