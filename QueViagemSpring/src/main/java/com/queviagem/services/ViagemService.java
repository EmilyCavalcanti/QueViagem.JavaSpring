package com.queviagem.services;

import java.util.List;

import com.queviagem.models.Viagem;

public interface ViagemService {

	
List<Viagem> viagemAll();
	
	Viagem listViagemById(Long id);

	Viagem saveViagem(Viagem viagem);

	Viagem updateViagem(Long id, Viagem viagemUpdate);

	void deleteById(Long id);




}
