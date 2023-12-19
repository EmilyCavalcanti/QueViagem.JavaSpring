package com.queviagem.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queviagem.models.Destinos;
import com.queviagem.repositories.DestinosRepository;
import com.queviagem.services.DestinosService;

@Service
public class DestinosServiceimpl implements DestinosService {
	

	@Autowired
	private DestinosRepository dr;
	
	
	@Override
	public List<Destinos> destinosAll() {

		return dr.findAll();
	}

	@Override
	public Destinos listDestinosById(Long id) {

		return dr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
	}

	@Override
	public Destinos saveDestinos(Destinos destinos) {		
		
		return dr.save(destinos);
	}
	@Override
	public Destinos updateDestinos(Long id, Destinos destinosUpdate) {
		Destinos destinosExists = dr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		destinosExists.setPais(destinosUpdate.getPais());
		destinosExists.setCidade(destinosUpdate.getCidade());
		destinosExists.setValor(destinosUpdate.getValor());
		destinosExists.setPromocoes(destinosUpdate.getPromocoes());
				
		return dr.save(destinosExists);
	}

	@Override
	public void deleteById(Long id) {
		dr.deleteById(id);
	}


}
