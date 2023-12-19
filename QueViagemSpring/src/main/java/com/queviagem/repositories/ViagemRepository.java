package com.queviagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.queviagem.models.Viagem;


@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Long>{

}
