package com.everis.beca.GestionPago.solicitudes.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.solicitudes.dto.resolucionDTO;
import com.everis.beca.GestionPago.solicitudes.entity.resolucionEntity;
import com.everis.beca.GestionPago.solicitudes.repository.resolucionRepository;
import com.everis.beca.GestionPago.solicitudes.servic.resolucionService;
@Service
public class resolucionServiceImple implements resolucionService {

	@Autowired
	resolucionRepository resolucionRepositorys;
	
	@Override
	public resolucionDTO creadResolucion(resolucionDTO resolucionDto) {
		resolucionEntity resolEntity = new resolucionEntity();
		
		
		resolEntity.setIdResolucion(resolucionDto.getIdResolucion());
		resolEntity.setComentario(resolucionDto.getComentario());
		resolEntity.setMontoTotal(resolucionDto.getMontoTotal());
		resolEntity.setRespuesta_idRespuesta(resolucionDto.getRespuesta_idRespuesta());
		
		
		resolucionRepositorys.save(resolEntity);
		
		
		
		return resolucionDto;
	}

}
