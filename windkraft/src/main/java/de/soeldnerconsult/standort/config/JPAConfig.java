package de.soeldnerconsult.standort.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@ComponentScan
@EnableJpaRepositories(basePackages="de.soeldnerconsult.windkraft.repositories")
public class JPAConfig {
	

	@Bean
	public DataSource dataSource(){
		return
			(new EmbeddedDatabaseBuilder())
			//.addScript("classpath:testdb/schema.sql")
			.build();
	}	
		

	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		
	
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		//adapter.setGenerateDdl(true);
	
		adapter.setDatabase(Database.HSQL);

		Properties props = new Properties();
		props.setProperty("hibernate.format_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "create-drop");

		
		emf.setDataSource(dataSource());
		emf.setPackagesToScan("de.soeldnerconsult.windkraft.*");
		emf.setJpaProperties(props);
		emf.setJpaVendorAdapter(adapter);
		return emf;
	}
	
	@Autowired
	DataSource dataSource;
	
	  @Bean
	    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {

	        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
	        jpaTransactionManager.setEntityManagerFactory(emf);
	        return jpaTransactionManager;
	    }   
	
}
