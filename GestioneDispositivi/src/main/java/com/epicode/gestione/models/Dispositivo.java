package com.epicode.gestione.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Dispositivo")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private Tipo tipo;
	private Stato stato;
	private String name;
}
