package br.com.stefanini.maratonadev.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.dao.AluguelDao;
import br.com.stefanini.maratonadev.dto.AluguelDto;
import br.com.stefanini.maratonadev.model.Aluguel;
import br.com.stefanini.maratonadev.model.parser.AluguelParser;

@RequestScoped
public class AluguelService {
	@Inject
	AluguelDao dao;
	
	@Transactional(rollbackOn = Exception.class)
	public void inserir(AluguelDto aluguelDto) {
		Aluguel aluguel = AluguelParser.get().entidade(aluguelDto);

		dao.inserir(aluguel);
	}

}
