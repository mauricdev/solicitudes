package com.everis.beca.GestionPago.solicitudes.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class resolucionDTO  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer idResolucion;
	private String montoTotal;
	private String Comentario;
	private Integer Respuesta_idRespuesta;
	
}
