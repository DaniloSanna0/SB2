package com.epicode.gestione.config;

import org.springframework.context.annotation.Configuration;

import com.epicode.gestione.models.Dispositivo;
import com.epicode.gestione.models.Stato;
import com.epicode.gestione.models.Tipo;

@Configuration
public class DispositivoConfig {
	
	public Dispositivo newDisp() {
		
		Dispositivo d1 = new Dispositivo();
		
		d1.setStato(Stato.DISPONIBILE);
		
		d1.setTipo(Tipo.LAPTOP);
		
		return d1;
	}

}
