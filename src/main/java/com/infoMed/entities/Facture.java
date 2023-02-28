package com.infoMed.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date; 
	private double montantPaye;
	private double resteNonPaye;
	private int nombreMois;
	private double tarifMois;
	private boolean isPayed;
	@ManyToOne
	@JoinColumn(name="idClient")
	Client client;
	@OneToOne
	@JoinColumn(name="idVente")
	private Vente vente;
	
	
	
	

}
