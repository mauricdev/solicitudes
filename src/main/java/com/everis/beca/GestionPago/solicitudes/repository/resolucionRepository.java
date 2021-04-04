package com.everis.beca.GestionPago.solicitudes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.beca.GestionPago.solicitudes.entity.resolucionEntity;


@Repository
public interface resolucionRepository extends JpaRepository<resolucionEntity, Integer>{

}