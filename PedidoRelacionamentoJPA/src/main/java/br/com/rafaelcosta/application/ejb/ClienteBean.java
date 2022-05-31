package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Cliente;

//tempo de vida do ejb, esse espera ser criada uma nova requisição para agir
@Stateless
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	//vamos usar esse método no ourtro projeto, seleciona os itens que vão ser listados
	//transforma o objeto em tabela
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
