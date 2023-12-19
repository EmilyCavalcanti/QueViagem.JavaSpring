package com.queviagem.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queviagem.models.Passageiro;
import com.queviagem.repositories.PassageiroRepository;
import com.queviagem.services.PassageiroService;

@Service
public class PassageiroServiceimpl implements PassageiroService {
	

	@Autowired
	private PassageiroRepository pr;

	@Override
	public List<Passageiro> passageiroAll() {

		return pr.findAll();
	}

	@Override
	public Passageiro listPassageiroById(Long id) {

		return pr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
	}

	@Override
	public Passageiro savePassageiro(Passageiro Passageiro) {

		return pr.save(Passageiro);
	}

	@Override
	public Passageiro updatePassageiro(Long id, Passageiro passageiroUpdate) {
		
		Passageiro passageiroExists =  pr. findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
		passageiroExists.setNome(passageiroUpdate.getNome());
		passageiroExists.setCpf(passageiroUpdate.getCpf());
		passageiroExists.setEmail(passageiroUpdate.getEmail());
		passageiroExists.setSenha(passageiroUpdate.getSenha());

		return pr.save(passageiroExists);
	}


	@Override
	public void deleteById(Long id) {
		pr.deleteById(id);

}
}