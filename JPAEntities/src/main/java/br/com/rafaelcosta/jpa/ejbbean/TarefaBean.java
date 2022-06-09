package br.com.rafaelcosta.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;
//Stateles é uma classe que representa um serviço
@Stateless
public class TarefaBean {
//Persistence context é onde fica armazenado os objetos do entity manager
	@PersistenceContext
	private EntityManager em;
	//Persist coloca os dados no banco de dados
	public void inserir(Tarefa tarefa) {
		em.persist(tarefa);
	}
	//merge sobrescreve os dados
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	//exclui os dados
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	public Tarefa carregar(int id) {
		//find procura o valor
		return em.find(Tarefa.class, id);
	}
}
