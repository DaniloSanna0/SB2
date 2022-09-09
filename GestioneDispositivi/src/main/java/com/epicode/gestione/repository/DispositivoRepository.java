package com.epicode.gestione.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicode.gestione.models.Dispositivo;

@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long>{

	public Optional<Dispositivo> findById (Long id);
	
	public boolean existsByUserName(String userName);
}
