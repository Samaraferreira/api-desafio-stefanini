package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.AluguelDto;
import br.com.stefanini.maratonadev.dto.AluguelDto;
import br.com.stefanini.maratonadev.model.Aluguel;
import br.com.stefanini.maratonadev.model.Aluguel;

public class AluguelParser {
	public static AluguelParser get() {
		return new AluguelParser();
	}
	
	public Aluguel entidade(AluguelDto dto) {
		Aluguel entidade = new Aluguel();
		
		entidade.setUserId(dto.getUserId());
		entidade.setPlaca_carro(dto.getPlaca_carro());

		
		return entidade;
	}
	
	public AluguelDto dto(Aluguel entidade) {
		AluguelDto dto = new AluguelDto();
		
		dto.setPlaca_carro(entidade.getPlaca_carro());
		dto.setUserId(entidade.getUserId());
		
		return dto;
	}
}
