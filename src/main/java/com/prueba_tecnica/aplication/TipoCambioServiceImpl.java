package com.prueba_tecnica.aplication;


import com.prueba_tecnica.aplication.mapper.TipoCambioMapper;
import com.prueba_tecnica.domain.TipoCambioRequestDTO;
import com.prueba_tecnica.domain.TipoCambioResponseDTO;
import com.prueba_tecnica.domain.model.TipoCambio;
import com.prueba_tecnica.domain.service.ITipoCambioService;
import com.prueba_tecnica.infraestructure.repository.TipoCambioRepository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;
@Service
public class TipoCambioServiceImpl implements   ITipoCambioService  {

	private  TipoCambioRepository tipoCambioRepository;
	@Autowired
    public TipoCambioServiceImpl(TipoCambioRepository tipoCambioRepository) {
        this.tipoCambioRepository = tipoCambioRepository;
    }

	@Override
	public TipoCambio findByMonedaOrigenAndMonedaDestino(Date fechaCambio,String monedaOrigen, String monedaDestino) {

		return this.tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(fechaCambio,monedaOrigen, monedaDestino);
	}
	
    @Override
    public TipoCambio insert(TipoCambioRequestDTO tipoCambio) {
		TipoCambio tipoCambioSend = TipoCambioMapper.toEntity(tipoCambio);
			
        TipoCambio existingTipoCambio = tipoCambioRepository.findByMonedaOrigenAndMonedaDestino(tipoCambioSend.getFechaCambio(),
        		tipoCambioSend.getMonedaOrigen(), tipoCambioSend.getMonedaDestino());
        if (existingTipoCambio != null) {
            existingTipoCambio.setValorTipoCambio(tipoCambio.getValorTipoCambio());
            return tipoCambioRepository.save(existingTipoCambio);
        } else {
            return tipoCambioRepository.save(tipoCambioSend);
        }
    }

    @Override
    public List<TipoCambioResponseDTO> listar() {
    	List<TipoCambio> tipoCambioList = (List<TipoCambio>) tipoCambioRepository.findAll();
        return TipoCambioMapper.toEntityResponseList(tipoCambioList);
    }

}
