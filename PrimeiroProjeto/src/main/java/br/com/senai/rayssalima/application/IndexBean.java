package br.com.senai.rayssalima.application;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class IndexBean implements Serializable {
	
	public String getMensagem() {
		
		return "Vim do futuro pra dizer que";
	}
	
}
