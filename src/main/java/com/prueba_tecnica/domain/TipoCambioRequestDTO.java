package com.prueba_tecnica.domain;

import java.util.Date;


public class TipoCambioRequestDTO {

	    private Date fechaCambio;
	    private String monedaOrigen;
	    private String monedaDestino;
	    private Double valorTipoCambio;
	    
	    public String getMonedaOrigen() {
	        return monedaOrigen;
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
