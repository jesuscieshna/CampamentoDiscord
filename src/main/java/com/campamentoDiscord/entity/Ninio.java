package com.campamentoDiscord.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ninio {
	@Id
	
	private Long identificacion;
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	@ManyToOne
	private Grupo grupo;
}
