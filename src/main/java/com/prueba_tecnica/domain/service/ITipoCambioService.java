package com.prueba_tecnica.domain.service;

import java.util.Date;
import java.util.List;

import com.prueba_tecnica.aplication.mapper.TipoCambioMapper;
import com.prueba_tecnica.domain.TipoCambioRequestDTO;
import com.prueba_tecnica.domain.TipoCambioResponseDTO;
import com.prueba_tecnica.domain.model.TipoCambio;

public interface ITipoCambioService {
	public TipoCambio findByMonedaOrigenAndMonedaDestino(Date fechaCambio,String monedaOrigen, String monedaDestino);
	public TipoCambio insert(TipoCambioRequestDTO tipoCambio);
	public List<TipoCambioResponseDTO> listar();
	
}
