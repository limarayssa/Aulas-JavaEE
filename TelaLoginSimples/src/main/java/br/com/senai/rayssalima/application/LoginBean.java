package br.com.senai.rayssalima.application;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("loginb") 
@RequestScoped
public class LoginBean implements Serializable{

	private String nome;
	private String senha;
	//mensagem após a construção
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado");
	}
	//mensagem antes de ser destruído
	@PreDestroy
	public void onDestroy () {
		System.out.println("Bean será destruído");
	}
	//valor estático de login
	public String doLogin() {
		if ("abc".equals(nome) && "123".equals(senha)) {
			return "sucesso";
		}
		//retornar vazio se os valores estiverem errado
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
