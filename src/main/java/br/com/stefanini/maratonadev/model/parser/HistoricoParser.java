package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.HistoricoDto;
import br.com.stefanini.maratonadev.model.Historico;

public class HistoricoParser {
	public static HistoricoParser get() {
		return new HistoricoParser();
	}
	
	public Historico entidade(HistoricoDto dto) {
		Historico entidade = new Historico();
		
		entidade.setId(dto.getId());
		entidade.setUserCpf(dto.getUserCpf());
		entidade.setPlacaCarro(dto.getPlacaCarro());
		entidade.setDataAluguel(dto.getDataAluguel());

		return entidade;
	}
	
	public HistoricoDto dto(Historico entidade) {
		HistoricoDto dto = new HistoricoDto();
		
		dto.setId(entidade.getId());
		dto.setUserCpf(entidade.getUserCpf());
		dto.setPlacaCarro(entidade.getPlacaCarro());
		dto.setDataAluguel(entidade.getDataAluguel());
		
		return dto;
	}
}
