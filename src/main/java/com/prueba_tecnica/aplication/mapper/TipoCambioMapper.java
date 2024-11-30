package com.prueba_tecnica.aplication.mapper;


import com.prueba_tecnica.domain.model.TipoCambio;

import java.util.List;
import java.util.stream.Collectors;

import com.prueba_tecnica.domain.TipoCambioRequestDTO;
import com.prueba_tecnica.domain.TipoCambioResponseDTO;

public  class  TipoCambioMapper {

    public static TipoCambioRequestDTO toDTO(TipoCambio tipoCambio) {
        TipoCambioRequestDTO dto = new TipoCambioRequestDTO();
        dto.setFechaCambio(tipoCambio.getFechaCambio());
        dto.setMonedaOrigen(tipoCambio.getMonedaOrigen());
        dto.setMonedaDestino(tipoCambio.getMonedaDestino());
        dto.setValorTipoCambio(tipoCambio.getValorTipoCambio());
        
        return dto;
    }

    // Método para convertir de TipoCambioDTO a TipoCambio (Entidad)
    public static TipoCambio toEntity(TipoCambioRequestDTO tipoCambioDTO) {
        TipoCambio tipoCambio = new TipoCambio();
        tipoCambio.setFechaCambio(tipoCambioDTO.getFechaCambio());
        tipoCambio.setMonedaOrigen(tipoCambioDTO.getMonedaOrigen());
        tipoCambio.setMonedaDestino(tipoCambioDTO.getMonedaDestino());
        tipoCambio.setValorTipoCambio(tipoCambioDTO.getValorTipoCambio());
        
        return tipoCambio;
    }
    public static TipoCambioResponseDTO toEntityResponse(TipoCambio tipoCambio) {
        TipoCambioResponseDTO tipoCambioResponseDTO = new TipoCambioResponseDTO(
                tipoCambio.getId(),
                tipoCambio.getFechaCambio(),
                tipoCambio.getMonedaOrigen(),
                tipoCambio.getMonedaDestino(),
                tipoCambio.getValorTipoCambio()
        );
        return tipoCambioResponseDTO;
    }
    public static List<TipoCambioResponseDTO> toEntityResponseList(List<TipoCambio> tipoCambioList) {
    	
        return tipoCambioList.stream()
                             .map(TipoCambioMapper::toEntityResponse)  // Usamos el método toEntityResponse para convertir cada objeto
                             .collect(Collectors.toList());  // Colectamos el resultado en una lista
    }
}
