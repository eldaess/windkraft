package de.soeldnerconsult.windkraft.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import de.soeldnerconsult.windkraft.hersteller.Hersteller;
import de.soeldnerconsult.windkraft.standort.Standort;

public interface HerstellerRepository extends JpaRepository<Hersteller, Integer> {


	

}
