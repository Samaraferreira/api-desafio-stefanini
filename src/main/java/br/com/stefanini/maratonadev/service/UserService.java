package br.com.stefanini.maratonadev.service;

import br.com.stefanini.maratonadev.dao.UserDao;
import br.com.stefanini.maratonadev.dto.UserDto;
import br.com.stefanini.maratonadev.model.Endereco;
import br.com.stefanini.maratonadev.model.User;
import br.com.stefanini.maratonadev.model.parser.UserParser;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
public class UserService {
    
    @Inject
	UserDao dao;
	
	@Transactional(rollbackOn = Exception.class)
	public void inserir(UserDto userDto) {
		User user = UserParser.get().entidade(userDto);
		
		dao.inserir(user);
	}
	
	public List<UserDto> listar() {
		return dao
				.listar()
				.stream()
				.map(UserParser.get()::dto)
				.collect(Collectors.toList());
	}
}
