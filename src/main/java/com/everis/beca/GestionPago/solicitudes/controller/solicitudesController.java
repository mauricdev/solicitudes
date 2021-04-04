package com.everis.beca.GestionPago.solicitudes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.beca.GestionPago.solicitudes.dto.jsonDTO;
import com.everis.beca.GestionPago.solicitudes.dto.proveedorDTO;
import com.everis.beca.GestionPago.solicitudes.dto.resolucionDTO;
import com.everis.beca.GestionPago.solicitudes.dto.respuestaDTO;
import com.everis.beca.GestionPago.solicitudes.dto.solicitudDTO;
import com.everis.beca.GestionPago.solicitudes.servic.proveedorService;
import com.everis.beca.GestionPago.solicitudes.servic.resolucionService;
import com.everis.beca.GestionPago.solicitudes.servic.respuestaService;
import com.everis.beca.GestionPago.solicitudes.servic.solicitudService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/solicitudes")
public class solicitudesController {
	public Integer idproveedor;
	public String nombre;
	public String razonSocial;
	public String email;
	public Integer idResolucion;
	public String montoTotal;
	public String Comentario;
	public Integer Respuesta_idRespuesta;
	public Integer idRespuesta;
	public String estatus;
	public Integer solicitud_Solicitante_idSolicitante;
	public String solicitud_aprovador_idaprovador;
	public Integer Solicitante_idSolicitante;
	public String aprovador_idaprovador;
	public Integer numero;
	public Integer monto;
	public Integer iva;
	public String prioridad;
	public String Descripcion;
	public Integer proveedor_idproveedor;

	
	
	@Autowired
	private proveedorService proveedorServicios;
	@Autowired
	private resolucionService resolucionServicios;
	@Autowired
	private respuestaService respuestaServicios;
	@Autowired
	private solicitudService solicitudServicios;

	@RequestMapping(value = "/proveedor" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostProveedor(@RequestBody jsonDTO Json) {
	
		
		
		idproveedor = Json.getIdproveedor();
		nombre = Json.getNombre();
		razonSocial = Json.getRazonSocial();
		email = Json.getEmail();
		
		proveedorDTO provDTO = new proveedorDTO();
		
		provDTO.setIdproveedor(idproveedor);
		provDTO.setEmail(email);
		provDTO.setNombre(nombre);
		provDTO.setRazonSocial(razonSocial);
		
		proveedorServicios.creadResolucion(provDTO);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	@RequestMapping(value = "/resolucion" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostResolucion(@RequestBody jsonDTO Json) {
	
		
		
		idResolucion = Json.getIdResolucion();
		montoTotal = Json.getMontoTotal();
		Comentario = Json.getComentario();
		Respuesta_idRespuesta = Json.getRespuesta_idRespuesta();
		
		resolucionDTO resDTO = new resolucionDTO();
		
		resDTO.setComentario(Comentario);
		resDTO.setIdResolucion(idResolucion);
		resDTO.setMontoTotal(montoTotal);
		resDTO.setRespuesta_idRespuesta(Respuesta_idRespuesta);
		
		
		resolucionServicios.creadResolucion(resDTO);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}

	@RequestMapping(value = "/respuesta" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostRespuesta(@RequestBody jsonDTO Json) {
	
		 idRespuesta = Json.getIdRespuesta();
		 estatus = Json.getEstatus();
		 solicitud_Solicitante_idSolicitante = Json.getSolicitud_Solicitante_idSolicitante();
		 solicitud_aprovador_idaprovador = Json.getSolicitud_aprovador_idaprovador();
		
		 System.out.println(solicitud_aprovador_idaprovador);
		respuestaDTO respuDTO = new respuestaDTO();
	
		
		respuDTO.setIdRespuesta(idRespuesta);
		respuDTO.setSolicitud_aprovador_idaprovador(solicitud_aprovador_idaprovador);
		respuDTO.setSolicitud_Solicitante_idSolicitante(solicitud_Solicitante_idSolicitante);
		respuDTO.setEstatus(estatus);
		
		
		 System.out.println(respuDTO.getIdRespuesta());
		respuestaServicios.creadResolucion(respuDTO);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
	@RequestMapping(value = "/solicitud" , method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Boolean> PostSolicitud(@RequestBody jsonDTO Json) {
	
		
		Solicitante_idSolicitante = Json.getSolicitante_idSolicitante();
		aprovador_idaprovador = Json.getAprovador_idaprovador();
		numero = Json.getNumero();
		monto = Json.getMonto();
		iva = Json.getIva();
		prioridad = Json.getPrioridad();
		Descripcion = Json.getDescripcion();
		proveedor_idproveedor = Json.getProveedor_idproveedor();
		
		solicitudDTO soliDTO = new solicitudDTO();
		soliDTO.setSolicitante_idSolicitante(Solicitante_idSolicitante);
		soliDTO.setAprovador_idaprovador(aprovador_idaprovador);
		soliDTO.setDescripcion(Descripcion);
		soliDTO.setIva(iva);
		soliDTO.setMonto(monto);
		soliDTO.setNumero(numero);
		soliDTO.setPrioridad(prioridad);
		soliDTO.setProveedor_idproveedor(proveedor_idproveedor);
		

		
		solicitudServicios.creadResolucion(soliDTO);
		
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}


}
