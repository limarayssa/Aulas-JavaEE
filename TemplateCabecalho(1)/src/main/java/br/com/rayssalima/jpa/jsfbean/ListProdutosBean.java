package br.com.rayssalima.jpa.jsfbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.rayssalima.application.bean.ProdutoBean;
import br.com.senai.rayssalima.application.model.ProdutoTabela;
@SuppressWarnings("serial")
@Named
@RequestScoped
public class ListProdutosBean implements Serializable {
	
	public void setProdutoTabela(List<ProdutoTabela> produtoTabela) {
		this.produtoTabela = produtoTabela;
	}

	private Integer[] selectedProdutoTabelaIds;
	
	@EJB
	private ProdutoBean produtoBean;
	
	private List<ProdutoTabela> produtoTabela;
	
	@PostConstruct
	public void init() {
		produtoTabela = produtoBean.listar();
	}
	
	public List<ProdutoTabela> getProdutoTabela() {
		return produtoTabela;
	}

	public Integer[] getSelectedProdutosTabelaIds() {
		return selectedProdutoTabelaIds;
	}

	public void setSelectedProdutosTabelaIds(Integer[] selectedProdutosTabelaIds) {
		this.selectedProdutoTabelaIds = selectedProdutosTabelaIds;
	}

}
	
	
