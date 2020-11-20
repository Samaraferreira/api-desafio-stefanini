package br.com.stefanini.maratonadev.dto;

import java.util.UUID;

public class AluguelDto {
	
	private UUID userId;
 
    private String placa_carro;

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getPlaca_carro() {
		return placa_carro;
	}

	public void setPlaca_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}
 
}
