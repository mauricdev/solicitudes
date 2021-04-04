package com.everis.beca.GestionPago.solicitudes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "resolucion")
public class resolucionEntity {
	
	@Id
	@Column(name = "idresolucion")
	private Integer idResolucion;
	
	@Column(name = "montototal")
	private String montoTotal;
	
	@Column(name = "Comentario")
	private String Comentario;
	
	@Column(name = "respuesta_idrespuesta")
	private Integer Respuesta_idRespuesta;
}
