package com.prueba_tecnica.webApi;
import java.net.URI;
import java.util.List;


import com.prueba_tecnica.aplication.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.prueba_tecnica.domain.TipoCambioRequestDTO;
import com.prueba_tecnica.domain.TipoCambioResponseDTO;
import com.prueba_tecnica.domain.model.TipoCambio;
import com.prueba_tecnica.domain.service.ITipoCambioService;

import com.prueba_tecnica.aplication.mapper.TipoCambioMapper;

@RestController
@RequestMapping("/TipoCambio")
public class TipoCambioController {
	private  ITipoCambioService tipoCambioService;

    @Autowired
    public TipoCambioController(ITipoCambioService tipoCambioService) {
        this.tipoCambioService = tipoCambioService;
    }
	
    @PostMapping("/insertar")
    public ResponseEntity<TipoCambio> crearTipoCambio(@RequestBody TipoCambioRequestDTO tipoCambio) {

        TipoCambio nuevoTipoCambio = tipoCambioService.insert(tipoCambio);
        
        return ResponseEntity
                .created(URI.create("/tipoCambio/" + nuevoTipoCambio.getId()))  
                .body(nuevoTipoCambio); 
    }
    @GetMapping("/listar")
    public ResponseEntity<List<TipoCambioResponseDTO>> listar() {
        List<TipoCambioResponseDTO> tipoCambios = tipoCambioService.listar();
        return ResponseEntity.ok(tipoCambios);
    }

}

