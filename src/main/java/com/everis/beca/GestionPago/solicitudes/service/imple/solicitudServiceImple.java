package com.everis.beca.GestionPago.solicitudes.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.solicitudes.dto.solicitudDTO;
import com.everis.beca.GestionPago.solicitudes.entity.solicitudEntity;
import com.everis.beca.GestionPago.solicitudes.repository.solicitudRepository;
import com.everis.beca.GestionPago.solicitudes.servic.solicitudService;
@Service
public class solicitudServiceImple implements solicitudService {

	@Autowired
	solicitudRepository solicitudRepositorys;
	
	@Override
	public solicitudDTO creadResolucion(solicitudDTO solicitudDto) {
		
		solicitudEntity soliEntity = new solicitudEntity();
		soliEntity.setSolicitante_idSolicitante(solicitudDto.getSolicitante_idSolicitante());
		soliEntity.setAprovador_idaprovador(solicitudDto.getAprovador_idaprovador());
		soliEntity.setDescripcion(solicitudDto.getDescripcion());
		soliEntity.setIva(solicitudDto.getIva());
		soliEntity.setMonto(solicitudDto.getMonto());
		soliEntity.setNumero(solicitudDto.getNumero());
		soliEntity.setPrioridad(solicitudDto.getPrioridad());
		soliEntity.setProveedor_idproveedor(solicitudDto.getProveedor_idproveedor());
		
		solicitudRepositorys.save(soliEntity);
		
		return solicitudDto;
	}

}
