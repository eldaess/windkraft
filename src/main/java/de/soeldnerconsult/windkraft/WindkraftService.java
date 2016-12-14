package de.soeldnerconsult.windkraft;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.soeldnerconsult.windkraft.hersteller.Hersteller;
import de.soeldnerconsult.windkraft.repositories.HerstellerRepository;
import de.soeldnerconsult.windkraft.repositories.StandortRepository;
import de.soeldnerconsult.windkraft.standort.Standort;



@Component
public class WindkraftService {

	@Autowired
	private StandortRepository standortRepository;
	
	@Autowired
	private HerstellerRepository herstellerRepository;
	
	@PersistenceContext private EntityManager em;
	
	@PostConstruct
	public void insertInitialData(){
		
		//Windkraft und Standort Testdatensätze einfügen
		
		//Hersteller
		/*Hersteller enercon = new Hersteller();
		enercon.setHersteller_id(1);
		enercon.setHersteller("Enercon");	
		herstellerRepository.save(enercon);*/
		
		/*Hersteller avacon = new Hersteller();
		enercon.setHersteller_id(2);
		enercon.setHersteller("Avacon");	
		herstellerRepository.save(avacon);*/
		
		
		//Standort
		Standort grossviehberg = new Standort();
		
		grossviehberg.setId(1);
		grossviehberg.setStandort("Großviehberg");
		grossviehberg.setNleistung(2.3);
		
		grossviehberg.setBaujahr(2015);
		

		Set<Standort> standortSet = new HashSet<>();
		standortSet.add(grossviehberg);		
		//enercon.setStandort(standortSet);
		
		standortRepository.save(grossviehberg);
			
		
		//for(int x=0; x<10; x++){System.out.println(x);}
		
		/*List<Hersteller> hlist = new ArrayList<>();
		hlist = herstellerRepository.findAll();
		for (Hersteller h : hlist){
		System.out.println(h.getHersteller());}*/
		
		
		
		}
		
		
		
	
		
			
		
	
	

	
}
