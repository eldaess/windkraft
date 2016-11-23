package config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import standort.*;
import wind.internal.standort.HibernateStandortRepository;

@Configuration
@Profile({"hibernate"})
public class AppConfigHibernate {

	@Autowired
	SessionFactory sessionFactory;
	
	@Bean
	public StandortRepository standortRepository(){
		return new HibernateStandortRepository(sessionFactory);
	}
	
	/*@Bean
	public AccountRepository accountRepository(){
		return new HibernateAccountRepository(sessionFactory);
	}
	
	@Bean
	public AccountManager accountManager(){
		return new HibernateAccountManager(sessionFactory);
	}*/
	
}
