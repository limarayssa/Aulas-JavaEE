package br.com.senai.rayssalima.application.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.rayssalima.application.model.Usuario;

@Stateless
public class LoginBeanBean {
	
	@PersistenceContext
	private EntityManager em;
	
	public void inserir (Usuario usuario) {
		em.persist(usuario);
	}

}
