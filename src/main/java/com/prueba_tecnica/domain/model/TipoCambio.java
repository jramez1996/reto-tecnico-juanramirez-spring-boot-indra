package com.prueba_tecnica.domain.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class TipoCambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esto indica que el ID se generará automáticamente
    private Long id;
    private Date fechaCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private Double valorTipoCambio;
    
    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }
	public Date getFechaCambio() {
		return fechaCambio;
	}

	public void setFechaCambio(Date fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public Double getValorTipoCambio() {
		return valorTipoCambio;
	}

	public void setValorTipoCambio(Double valorTipoCambio) {
		this.valorTipoCambio = valorTipoCambio;
	}
    
	
	
    
}

