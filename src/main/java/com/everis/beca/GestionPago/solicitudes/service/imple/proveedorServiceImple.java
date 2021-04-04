package com.everis.beca.GestionPago.solicitudes.service.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.GestionPago.solicitudes.dto.proveedorDTO;
import com.everis.beca.GestionPago.solicitudes.entity.proveedorEntity;
import com.everis.beca.GestionPago.solicitudes.repository.proveedorRepository;
import com.everis.beca.GestionPago.solicitudes.servic.proveedorService;
@Service
public class proveedorServiceImple  implements proveedorService{
	
	@Autowired
	proveedorRepository proveedorRepositorys;
	
	@Override
	public proveedorDTO creadResolucion(proveedorDTO proveedorDto) {
		
		proveedorEntity provEntity = new proveedorEntity();
		provEntity.setIdproveedor(proveedorDto.getIdproveedor());
		provEntity.setEmail(proveedorDto.getEmail());
		provEntity.setNombre(proveedorDto.getNombre());
		provEntity.setRazonSocial(proveedorDto.getRazonSocial());
		proveedorRepositorys.save(provEntity);
		
		return proveedorDto;
	}

}
