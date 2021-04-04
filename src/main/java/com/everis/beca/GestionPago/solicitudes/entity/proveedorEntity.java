package com.everis.beca.GestionPago.solicitudes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class proveedorEntity {

	@Id
	@Column(name = "idproveedor")
	private Integer idproveedor;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "razonsocial")
	private String razonSocial;
	
	@Column(name = "email")
	private String email;
}
