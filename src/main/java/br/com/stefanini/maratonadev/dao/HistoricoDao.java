package br.com.stefanini.maratonadev.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;

import br.com.stefanini.maratonadev.model.Historico;


@RequestScoped
public class HistoricoDao {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Long inserir(Historico aluguel) {
		try {
			aluguel.persistAndFlush();
			
			return aluguel.getId();
		} catch (ConstraintViolationException e) {
			return (long) 0;
		}
		
	}
	
	public List<Historico> listar(){
        return Historico.listAll();
    }
}
