package de.soeldnerconsult.windkraft.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import de.soeldnerconsult.windkraft.standort.Standort;

public interface StandortRepository extends CrudRepository<Standort, Integer>{
//	public Standort findById(Integer id);
//	public Standort findByStandortname(String standortname);
//	public Standort countById(Integer id);
//	public void save(Integer i, String string, double d, int j, int k);
}
