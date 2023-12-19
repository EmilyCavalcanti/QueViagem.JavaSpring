package com.queviagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.queviagem.models.Destinos;

@Repository
public interface DestinosRepository extends JpaRepository<Destinos, Long>{

}
