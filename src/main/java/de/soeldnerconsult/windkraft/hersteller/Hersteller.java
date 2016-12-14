package de.soeldnerconsult.windkraft.hersteller;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.soeldnerconsult.windkraft.*;
import de.soeldnerconsult.windkraft.standort.*;

@Entity
@Table(name="HERSTELLER")
public class Hersteller {

	@Id
	@Column(name="HERSTELLER_ID")
	private Integer hersteller_id;
	
	@OneToMany(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="HERSTELLER_ID")
	private Set<Standort> standort = new HashSet<>();
	
	

	@Column(name="HERSTELLER")
	private String hersteller;
	
	public Integer getHersteller_id() {
		return hersteller_id;
	}
	
	

	public void setHersteller_id(int hersteller_id) {
		this.hersteller_id = hersteller_id;
	}
	
	public Set<Standort> getStandort() {
		return standort;
	}

	public void setStandort(Set<Standort> standort) {
		this.standort = standort;
	}
	public String getHersteller() {
		return hersteller;
	}
	public Integer getHersteller_id(long id) {
		return hersteller_id;
	}
	

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	/*public List<Hersteller> getAllHersteller() {
		List<Hersteller> hlist = new ArrayList<>();
		
		return hlist;
	}*/
	
	public Hersteller() {}
	
	public Hersteller(Integer hersteller_id, String hersteller) {
		this.hersteller_id=hersteller_id;
		this.hersteller=hersteller;
	}
	
}
