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

import com.queviagem.models.Passageiro;
import com.queviagem.services.PassageiroService;


@RestController
@RequestMapping ("/passageiro")
public class PassageiroController {
	
	
	@Autowired
	private PassageiroService ps;
	
	@GetMapping("ListarClientesCadastrados")
	public List<Passageiro> passageiroAll(){
		
		return ps.passageiroAll();
	}
	
	@PostMapping("/CadastrarCliente")
	public Passageiro save (@RequestBody Passageiro passageiro) {

		return ps.savePassageiro(passageiro);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Passageiro> getPassageiroById(@PathVariable Long id) {
		Passageiro passageiro = ps.listPassageiroById(id);

	
	
		return ResponseEntity.ok(passageiro);

} 
	@PutMapping("/AtualizarCadastroCliente")
	public ResponseEntity<Passageiro> updatePassageiro (@PathVariable Long id, @RequestBody Passageiro passageiroUpdate) {
		Passageiro passageiro = ps.listPassageiroById(id);
		passageiro.setNome(passageiroUpdate.getNome());
		passageiro.setCpf(passageiroUpdate.getCpf());
		passageiro.setEmail(passageiroUpdate.getEmail());
		passageiro.setSenha(passageiroUpdate.getSenha());

		ps.updatePassageiro(id, passageiroUpdate);
   
		return ResponseEntity.ok(passageiro);
}
	

	@DeleteMapping("/ApagarCadastroCliente")
	public void deletePassageiro(@PathVariable Long id){
	ps.deleteById(id);

	}
}


