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
	
	@Inject
	private Flash flash1;
	private Flash flash2;
	private Flash flash3;
	
	public String somar() {
		flash1.put("valorUm", n1);
		
		return "resultsoma?faces-redirect=true";
	}
}
