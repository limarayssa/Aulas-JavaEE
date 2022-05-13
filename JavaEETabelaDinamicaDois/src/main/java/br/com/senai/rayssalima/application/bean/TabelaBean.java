package br.com.senai.rayssalima.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.rayssalima.application.model.Despesas;

@SuppressWarnings("serial") //tira anuncios de advertência
@Named("tabela")
@SessionScoped //tempo de vida da página, o "session" mantém os dados enquanto o navegador estiver aberto
public class TabelaBean implements Serializable{
	
	private List<Despesas> despesas = new ArrayList<>();

	
	public String inserir() {
		
		Despesas d = new Despesas(); //instância da listdatamodel
		d.setEdit(true);
		despesas.add(d);
		return null;
	}
	
	public String excluir(Despesas despesa) {
		
		despesas.remove(despesa);
		
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true); 
		
		return null;
	}
	
	public String gravar (Despesas despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List <Despesas> getDespesas() {
		return despesas;
	}

}
