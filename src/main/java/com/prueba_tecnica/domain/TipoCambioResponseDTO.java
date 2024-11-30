package com.prueba_tecnica.domain;

import java.util.Date;


public class TipoCambioResponseDTO {

	 	private Long id;
    
	    private Date fechaCambio;
	    private String monedaOrigen;
	    private String monedaDestino;
	    private Double valorTipoCambio;
	    
	    
	    
	    public TipoCambioResponseDTO(Long id, Date fechaCambio, String monedaOrigen, String monedaDestino,
				Double valorTipoCambio) {
			super();
			this.id = id;
			this.fechaCambio = fechaCambio;
			this.monedaOrigen = monedaOrigen;
			this.monedaDestino = monedaDestino;
			this.valorTipoCambio = valorTipoCambio;
		}

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

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		
	    
}
