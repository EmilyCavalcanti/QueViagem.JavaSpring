package com.queviagem.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queviagem.models.Viagem;
import com.queviagem.repositories.ViagemRepository;
import com.queviagem.services.ViagemService;


	@Service
	public class ViagemServiceimpl implements ViagemService {
		

		@Autowired
		private ViagemRepository pr;

		@Override
		public List<Viagem> viagemAll() {

			return pr.findAll();
		}

		@Override
		public Viagem listViagemById(Long id) {

			return pr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
		}

		@Override
		public Viagem saveViagem(Viagem Viagem) {

			return pr.save(Viagem);
		}

		@Override
		public Viagem updateViagem(Long id, Viagem viagemUpdate) {
			
			Viagem viagemExists =  pr. findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado"));
			viagemExists.setDataida(viagemUpdate.getDataida());
			viagemExists.setDatavolta(viagemUpdate.getDatavolta());
			

			return pr.save(viagemExists);
		}


		@Override
		public void deleteById(Long id) {
			pr.deleteById(id);

	}

	
}
