package com.queviagem.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Viagem {
	
//
//	private Long destinosId;
//	
//	private Long passageiroId;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long viagemId;

	@Column( nullable = false)
	private LocalDate dataida;
	
	@Column( nullable = false)
	private LocalDate datavolta;
	
	
	@ManyToOne
	private Destinos destino;
	
	@ManyToOne
	private Passageiro passageiro; 
	
	
	
	public Long getViagemId() {
		return viagemId;
	}


	public void setViagemId(Long viagemId) {
		this.viagemId = viagemId;
	}


	public LocalDate getDataida() {
		return dataida;
	}
	

	public void setDataida(LocalDate dataida) {
		this.dataida = dataida;
	}


	public LocalDate getDatavolta() {
		return datavolta;
	}


	public void setDatavolta(LocalDate datavolta) {
		this.datavolta = datavolta;
	}



	public Destinos getDestino() {
		return destino;
	}



	public void setDestino(Destinos destino) {
		this.destino = destino;
	}



	public Passageiro getPassageiro() {
		return passageiro;
	}



	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}


}
