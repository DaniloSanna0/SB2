package com.epicode.gestione.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epicode.gestione.dto.DispositivoDto;
import com.epicode.gestione.models.Dispositivo;
import com.epicode.gestione.repository.DispositivoRepository;

@Service
public class DispositivoService {
	
	@Autowired
	private DispositivoRepository rep;
	
	public Optional<Dispositivo> getById (Long id) {
		Optional<Dispositivo> dispositivoResult = rep.findById(id);
		return dispositivoResult;
	}
	
	public DispositivoDto addDispositivo(DispositivoDto dispositivoDto) {
		rep.save(dispositivoDto);
	}
	
	public void insertDispositivo(DispositivoDto dto) {
		if(rep.existsByUserName(dto.getName())) {}
	}
}
