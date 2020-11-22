package br.com.stefanini.maratonadev.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.dao.HistoricoDao;
import br.com.stefanini.maratonadev.dto.HistoricoDto;
import br.com.stefanini.maratonadev.model.Historico;
import br.com.stefanini.maratonadev.model.parser.HistoricoParser;

@RequestScoped
public class HistoricoService {
	@Inject
	HistoricoDao dao;
	
	@Transactional(rollbackOn = Exception.class)
	public void inserir(HistoricoDto historicoDto) {
		Historico aluguel = HistoricoParser.get().entidade(historicoDto);

		dao.inserir(aluguel);
	}
	
	public List<HistoricoDto> listar(){
        return dao.listar().stream().map(HistoricoParser.get()::dto).collect(Collectors.toList());
    }

}
