package br.com.senai.rayssalima.application.bean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.rayssalima.application.model.Despesas;

@Stateless
public class DespesaBean {

	@PersistenceContext
	private EntityManager em;
	
	public void inserir (Despesas despesas) {
		em.persist(despesas);
	}
	
	public void atualizar (Despesas despesas) {
		em.merge(despesas);
	}
	
	public void excluir (Despesas despesas) {
		despesas = carregar(despesas.getId());
		em.persist(despesas);
	}
	
	public Despesas carregar (int id) {
		return em.find(Despesas.class, id);
	}
}
