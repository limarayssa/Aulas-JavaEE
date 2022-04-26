package br.com.senai.rayssalima.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBeanSoma implements Serializable{

	private Integer n1;
	private Integer n2;
	private Integer n3;
	private Integer res = n1+n2+n3;
	
	
	
	public Integer getN1() {
		return n1;
	}

	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}

	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public Integer getN3() {
		return n3;
	}

	public void setN3(Integer n3) {
		this.n3 = n3;
	}

	@Inject
	private Flash flash1;
	private Flash flash2;
	private Flash flash3;
	private Flash result;
	
	public String somar() {
		flash1.put("valorUm", n1);
		
		return "resultsoma?faces-redirect=true";
	}
}
