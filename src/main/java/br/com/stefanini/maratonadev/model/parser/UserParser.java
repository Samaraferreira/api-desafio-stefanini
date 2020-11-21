package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.UserDto;
import br.com.stefanini.maratonadev.model.User;

public class UserParser {
	public static UserParser get() {
		return new UserParser();
	}
	
	public User entidade(UserDto dto) {
		User entidade = new User();
		
		entidade.setNome(dto.getNome());
		entidade.setCpf(dto.getCpf());
		entidade.setEmail(dto.getEmail());
		entidade.setContato(dto.getContato());
		entidade.setEndereco(dto.getEndereco());
		
		return entidade;
	}
	
	public UserDto dto(User entidade) {
		
		UserDto dto = new UserDto();
			
		dto.setNome(entidade.getNome());
		dto.setCpf(entidade.getCpf());
		dto.setEmail(entidade.getEmail());
		dto.setContato(entidade.getContato());
		dto.setEndereco(entidade.getEndereco());
		
		return dto;
	}
}
