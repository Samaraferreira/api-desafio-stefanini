package br.com.stefanini.maratonadev.dto;

import java.math.BigInteger;
import java.util.UUID;

public class AluguelDto {
	
	private BigInteger userId;
 
    private String placa_carro;

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getPlaca_carro() {
		return placa_carro;
	}

	public void setPlaca_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}
 
}
