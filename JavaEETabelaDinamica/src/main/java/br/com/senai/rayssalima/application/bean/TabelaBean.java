package br.com.senai.rayssalima.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.rayssalima.application.model.Despesas;

@SuppressWarnings("serial") //tira anuncios de advertência
@Named("tabela")
@SessionScoped //tempo de vida da página, o "session" mantém os dados enquanto o navegador estiver aberto
public class TabelaBean implements Serializable{
	
	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel <Despesas> despesas = new ListDataModel<>(despesasList); //lista que trabalha com o jsf
	
	public String inserir() {
		
		Despesas d = new Despesas(); //instância da listdatamodel
		d.setEdit(true);
		despesasList.add(d);
		return null;
	}
	
	public String excluir(Despesas despesa) {
		
		despesasList.remove(despesa);
		
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
	
	public ListDataModel<Despesas> getDespesas() {
		return despesas;
	}

}
