package br.com.stefanini.maratonadev.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbDateFormat;

public class HistoricoDto {
	
	private Long id;
	
	private BigInteger userCpf;
 
    private String placaCarro;

    @JsonbDateFormat("dd/MM/yyyy HH:mm")
    private LocalDateTime dataAluguel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getUserCpf() {
		return userCpf;
	}

	public void setUserCpf(BigInteger userCpf) {
		this.userCpf = userCpf;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public LocalDateTime getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(LocalDateTime dataAluguel) {
		this.dataAluguel = dataAluguel;
	}
}
