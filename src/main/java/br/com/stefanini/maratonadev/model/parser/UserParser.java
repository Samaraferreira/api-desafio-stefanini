package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.UserDto;
import br.com.stefanini.maratonadev.model.User;

public class UserParser {
	public static UserParser get() {
		return new UserParser();
	}
	
	public User entidade(UserDto dto) {
		User entidade = new User();
		
		entidade.setId(dto.getId());
		entidade.setNome(dto.getNome());
		entidade.setCpf(dto.getCpf());
		entidade.setEmail(dto.getEmail());
		entidade.setContato(dto.getContato());
		entidade.setCep(dto.getCep());
		entidade.setCidade(dto.getCidade());
		entidade.setBairro(dto.getBairro());
		entidade.setUf(dto.getUf());
		entidade.setLogradouro(dto.getLogradouro());
		entidade.setComplemento(dto.getComplemento());
		
		return entidade;
	}
	
	public UserDto dto(User entidade) {
		
		UserDto dto = new UserDto();
			
		dto.setId(entidade.getId());
		dto.setNome(entidade.getNome());
		dto.setCpf(entidade.getCpf());
		dto.setEmail(entidade.getEmail());
		dto.setContato(entidade.getContato());
		dto.setCep(entidade.getCep());
		dto.setCidade(entidade.getCidade());
		dto.setBairro(entidade.getBairro());
		dto.setUf(entidade.getUf());
		dto.setLogradouro(entidade.getLogradouro());
		dto.setComplemento(entidade.getComplemento());
		
		return dto;
	}
}
