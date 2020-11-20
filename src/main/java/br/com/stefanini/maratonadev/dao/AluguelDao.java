package br.com.stefanini.maratonadev.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.model.Aluguel;

@RequestScoped
public class AluguelDao {
	@Transactional
	public void inserir(Aluguel aluguel) {
		Aluguel.persist(aluguel);
	}
}
