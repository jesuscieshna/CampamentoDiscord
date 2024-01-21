package com.campamentoDiscord.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class ActividadMonitorGrupoKey implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Actividad actividad;
	private Monitor monitor;
	private Grupo grupo;
	private Date date;
	
}
