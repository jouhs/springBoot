package org.selflearn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPTES")
public class Compte implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String intitule;
	private double solde;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String intitule, double solde) {
		super();
		this.intitule = intitule;
		this.solde = solde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
