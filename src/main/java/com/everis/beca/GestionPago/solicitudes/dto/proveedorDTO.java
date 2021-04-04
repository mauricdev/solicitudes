package com.everis.beca.GestionPago.solicitudes.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class proveedorDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idproveedor;
	private String nombre;
	private String razonSocial;
	private String email;
	
}
