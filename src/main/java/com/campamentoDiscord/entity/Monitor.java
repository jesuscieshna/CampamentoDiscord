package com.campamentoDiscord.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monitor {
	@Id
	private Long id;
	private String dni;
	private String nombre;
	private String apellido;
	private String direccion;
}
