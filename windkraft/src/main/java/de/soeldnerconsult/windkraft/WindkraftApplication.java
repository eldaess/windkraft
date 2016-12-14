package de.soeldnerconsult.windkraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import de.soeldnerconsult.standort.config.JPAConfig;

@SpringBootApplication
@Import(JPAConfig.class)

public class WindkraftApplication {

	public static void main(String[] args) {
		SpringApplication.run(WindkraftApplication.class, args);
	}

	
	
	 
}
