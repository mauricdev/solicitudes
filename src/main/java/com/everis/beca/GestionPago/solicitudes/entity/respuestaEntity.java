package com.everis.beca.GestionPago.solicitudes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "respuesta")
public class respuestaEntity {

	@Id
	@Column(name = "idrespuesta")
	private Integer idRespuesta;
	
	@Column(name = "estatus")
	private String estatus;
	
	@Column(name = "solicitud_solicitante_idsolicitante")
	private Integer solicitud_Solicitante_idSolicitante;
	
	@Column(name = "solicitud_aprovador_idaprovador")	
	private String solicitud_aprovador_idaprovador;
	
}
