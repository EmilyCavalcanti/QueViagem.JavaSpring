package com.queviagem.services;

import java.util.List;

import com.queviagem.models.Passageiro;


public interface PassageiroService  {

	
	
	List<Passageiro> passageiroAll();
	
	Passageiro listPassageiroById(Long id);
	
	Passageiro savePassageiro(Passageiro passageiro);
	
	Passageiro updatePassageiro(Long id, Passageiro passageiroUpdated);
	
	void deleteById(Long id);


	
	
}


