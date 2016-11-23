package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.PlatformTransactionManager;

import standort.*;


@Configuration
@Profile("hibernate")
public class DbConfigHibernate {

	@Autowired
	DataSource dataSource;
	
	/**
	 * Define a Transaction Manager that works with Native Hibernate.
	 */
	@Bean
	public PlatformTransactionManager transactionManager(){
		HibernateTransactionManager tm = new HibernateTransactionManager(sessionFactory());
//		tm.setSessionFactory(sessionFactory());
		return tm;
	}
	
	/**
	 * The Hibernate Session Factory
	 */
	@Bean
	@SuppressWarnings("deprecation")
	public SessionFactory sessionFactory(){
		
		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		return builder.addProperties(props)
				.addAnnotatedClass(Standort.class)
				.buildSessionFactory();
	}
}
