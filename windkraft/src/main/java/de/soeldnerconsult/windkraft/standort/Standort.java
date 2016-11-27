package de.soeldnerconsult.windkraft.standort;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STANDORT")
public class Standort {

	@Id
	@Column(name="id")
	private long entityId;
	
	@Column(name="NAME")
	private String name;

	@Column(name="NLEISTUNG")
	private double nleistung;

	@Column(name="BAUJAHR")
	private int baujahr;
	
	@Column(name="HERSTELLERID")
	private int hersteller_id;
	

	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getHersteller_id() {
		return hersteller_id;
	}

	public void setHersteller_id(int hersteller_id) {
		this.hersteller_id = hersteller_id;
	}

	public Standort() {
	}

	
}
