package br.com.senai.rayssalima.application.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("logincad") 
@RequestScoped
public class LoginBean implements Serializable{

	private String nome;
	private String senha;
	
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	@PreDestroy
	public void onDestroy () {
		System.out.println("Bean será destruído");
	}
	
	public String doLogin() {
		if ("rayssa".equals(nome) && "rayssa".equals(senha)) {
			return "page1-template";
		}
		
		return null;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}