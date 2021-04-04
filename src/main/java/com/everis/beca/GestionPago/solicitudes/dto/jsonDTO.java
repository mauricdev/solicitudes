package com.everis.beca.GestionPago.solicitudes.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class jsonDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idproveedor;
	private String nombre;
	private String razonSocial;
	private String email;
	private Integer idResolucion;
	private String montoTotal;
	private String Comentario;
	private Integer Respuesta_idRespuesta;
	private Integer idRespuesta;
	private String estatus;
	private Integer solicitud_Solicitante_idSolicitante;
	private String solicitud_aprovador_idaprovador;
	private Integer Solicitante_idSolicitante;
	private String aprovador_idaprovador;
	private Integer numero;
	private Integer monto;
	private Integer iva;
	private String prioridad;
	private String Descripcion;
	private Integer proveedor_idproveedor;
}
