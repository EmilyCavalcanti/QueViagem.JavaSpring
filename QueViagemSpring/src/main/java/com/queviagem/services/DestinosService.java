package com.queviagem.services;

import java.util.List;

import com.queviagem.models.Destinos;


public interface DestinosService {

	
	List<Destinos> destinosAll();
	
	Destinos listDestinosById(Long id);

	Destinos saveDestinos(Destinos destinos);

	Destinos updateDestinos(Long id, Destinos destinosUpdate);

	void deleteById(Long id);




	
	
}
