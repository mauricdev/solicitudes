package com.everis.beca.GestionPago.solicitudes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "solicitud")
public class solicitudEntity {
	
	@Id
	@Column(name = "solicitante_idsolicitante")
	private Integer Solicitante_idSolicitante;
	
	@Column(name = "aprovador_idaprovador")
	private String aprovador_idaprovador;
	
	@Column(name = "numero")
	private Integer numero;
	
	@Column(name = "monto")
	private Integer monto;
	
	@Column(name = "iva")
	private Integer iva;
	
	@Column(name = "prioridad")
	private String prioridad;
	
	@Column(name = "Descripcion")
	private String Descripcion;
	
	@Column(name = "proveedor_idproveedor")
	private Integer proveedor_idproveedor;

}
