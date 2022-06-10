package br.com.rayssalima.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

import br.com.senai.rayssalima.application.bean.DespesaBean;
import br.com.senai.rayssalima.application.model.Despesas;

@Named("form")
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	private DespesaBean despesaBean;

	private Integer tarefaId;
	
	private Despesas despesas;
	
	public void gravar(AjaxBehaviorEvent event) {
		if(despesas.getId()==null) {
			despesaBean.inserir(despesas);
		}else {
			despesaBean.atualizar(despesas);
		}		
	}

	public void excluir(AjaxBehaviorEvent event) {
		despesaBean.excluir(despesas);
		despesas = null;
	}
	public Despesas getDespesas() {
		if(despesas==null) {
			despesas = new Despesas();
		}
		return despesas;
	}

	public Integer getDespesasId() {
		return tarefaId;
	}

	public void setDespesasId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}
