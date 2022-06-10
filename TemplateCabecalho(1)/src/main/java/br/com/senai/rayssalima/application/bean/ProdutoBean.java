package br.com.senai.rayssalima.application.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.rayssalima.application.model.ProdutoTabela;


@Stateless
public class ProdutoBean {

	@PersistenceContext
	private EntityManager em;
	//lista todos os produtos
	public List<ProdutoTabela> listar() {
		return em.createQuery("SELECT p FROM ProdutoTabela p", ProdutoTabela.class).getResultList();
	}
}