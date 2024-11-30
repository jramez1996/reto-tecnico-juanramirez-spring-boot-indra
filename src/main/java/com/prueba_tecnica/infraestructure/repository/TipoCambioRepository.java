package com.prueba_tecnica.infraestructure.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba_tecnica.domain.model.TipoCambio;
@Repository
public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long>  {

	@Query("SELECT t FROM TipoCambio t WHERE t.fechaCambio = :fechaCambio AND t.monedaOrigen = :monedaOrigen AND t.monedaDestino = :monedaDestino")
	TipoCambio findByMonedaOrigenAndMonedaDestino(@Param("fechaCambio") Date fechaCambio,
	                                               @Param("monedaOrigen") String monedaOrigen,
	                                               @Param("monedaDestino") String monedaDestino);

	
}

