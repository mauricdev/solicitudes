package com.everis.beca.GestionPago.solicitudes.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.solicitudes.dto.respuestaDTO;
import com.everis.beca.GestionPago.solicitudes.entity.respuestaEntity;
import com.everis.beca.GestionPago.solicitudes.repository.respuestaRepository;
import com.everis.beca.GestionPago.solicitudes.servic.respuestaService;
@Service
public class respuestaServiceImple implements respuestaService{

	@Autowired
	respuestaRepository respuestaRepositorys;
	
	@Override
	public respuestaDTO creadResolucion(respuestaDTO respuestaDto) {
		
		respuestaEntity resEntity = new respuestaEntity();
		
		
		resEntity.setIdRespuesta(respuestaDto.getIdRespuesta());
		resEntity.setEstatus(respuestaDto.getEstatus());
		resEntity.setSolicitud_aprovador_idaprovador(respuestaDto.getSolicitud_aprovador_idaprovador());
		resEntity.setSolicitud_Solicitante_idSolicitante(respuestaDto.getSolicitud_Solicitante_idSolicitante());

		respuestaRepositorys.save(resEntity);
		
		return respuestaDto;
	}

}
