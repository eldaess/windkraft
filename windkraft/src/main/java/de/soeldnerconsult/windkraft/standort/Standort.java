package de.soeldnerconsult.windkraft.standort;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import de.soeldnerconsult.windkraft.hersteller.Hersteller;

@Entity
@Table(name="STANDORT")
public class Standort {

	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="STANDORT")
	private String standort;

	@Column(name="NLEISTUNG")
	private double nleistung;

	@Column(name="BAUJAHR")
	private int baujahr;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public double getNleistung() {
		return nleistung;
	}

	public void setNleistung(double nleistung) {
		this.nleistung = nleistung;
	}

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	

	

	public Standort() {
	}

	
}
