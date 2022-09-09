package com.epicode.gestione.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epicode.gestione.dto.DispositivoDto;
import com.epicode.gestione.models.Dispositivo;
import com.epicode.gestione.service.DispositivoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {
	
	@Autowired
	private DispositivoService dispServ;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> finById(@PathVariable Long id){
		
		Optional<Dispositivo> disp = dispServ.getById(id);
		
		if(disp.isPresent()) {
			return new ResponseEntity<Dispositivo>(disp.get(), HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<>("Non esiste questo dispositivo", HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/")
	public void creaDispositivo(@RequestBody DispositivoDto dispositivoDto) {
		return ResponseEntity.ok(dispositivoDto);
	}
	
}
