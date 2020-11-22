package br.com.stefanini.maratonadev.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.model.User;

@RequestScoped
public class UserDao {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public BigInteger inserir(User user) {
		user.persistAndFlush();

		return user.getCpf();
	}
	
	public List<User> listar(){
		String nameSql = "LISTAR_USUARIOS";
		
		List<User> response;
		
		TypedQuery<User> query = em.createNamedQuery(nameSql, User.class);
		
		try {
			response = query.getResultList();
		}catch(NoResultException e) {
			response = new ArrayList();
		}
		
		return response;
    }
	
}
