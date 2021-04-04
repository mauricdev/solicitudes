package com.everis.beca.GestionPago.solicitudes.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class solicitudDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer Solicitante_idSolicitante;
	private String aprovador_idaprovador;
	private Integer numero;
	private Integer monto;
	private Integer iva;
	private String prioridad;
	private String Descripcion;
	private Integer proveedor_idproveedor;
}
