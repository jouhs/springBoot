package org.selflearn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPERATIONS")
public class Operation implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private double montant;
	private String sensOperation;
	@ManyToOne
	private Compte compte;
	

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operation(double montant, String sensOperation, Compte compte) {
		super();
		this.montant = montant;
		this.sensOperation = sensOperation;
		this.compte = compte;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getSensOperation() {
		return sensOperation;
	}
	public void setSensOperation(String sensOperation) {
		this.sensOperation = sensOperation;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
