package com.queviagem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queviagem.models.Destinos;
import com.queviagem.services.DestinosService;


@RestController
@RequestMapping("/destinos")
public class DestinosController {

	
	@Autowired
	private DestinosService ds;
	
	@GetMapping("/ListarDestinos")
	public List<Destinos> destinosAll(){
		
		return ds.destinosAll();
	}
	
	@PostMapping("/EscolherDestino")
	public Destinos salvar(@RequestBody Destinos destinos) {
		
		return ds.saveDestinos(destinos);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Destinos> getDestinosById(@PathVariable Long id) {
		Destinos destinos = ds.listDestinosById(id);

		return ResponseEntity.ok(destinos);
	}
	
	@PutMapping("/AtualizarDestino")
	public ResponseEntity<Destinos> updateDestinos(@PathVariable Long id, @RequestBody Destinos destinosUpdate) {
		Destinos destinos = ds.listDestinosById(id);
		destinos.setPais(destinosUpdate.getPais());
		destinos.setCidade(destinosUpdate.getCidade());
		destinos.setValor(destinosUpdate.getValor());
		destinos.setPromocoes(destinosUpdate.getPromocoes());
		

	ds.updateDestinos(id, destinosUpdate);

		return ResponseEntity.ok(destinos);
	}
	
	@DeleteMapping("/ApagarDestino")
	public void deleteDestinos(@PathVariable Long id) {
		ds.deleteById(id);
	}
}