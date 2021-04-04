package com.everis.beca.GestionPago.solicitudes.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class respuestaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idRespuesta;
	private String estatus;
	private Integer solicitud_Solicitante_idSolicitante;
	private String solicitud_aprovador_idaprovador;
	

}
