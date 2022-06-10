package br.com.senai.rayssalima.application.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.senai.rayssalima.application.model.Usuario;
import br.com.senai.rayssalima.application.model.UsuarioDao;

@Named("logincad") 
@RequestScoped
public class LoginBean implements Serializable{
	
	private UsuarioDao usuarioDao = new UsuarioDao();
	private Usuario usuario = new Usuario();
	
	public String envia () {
		usuario = usuarioDao.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
		if (usuario == null) {
			usuario = new Usuario();FacesContext.getCurrentInstance().addMessage(
			         null,
			         new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
			           "Erro no Login!"));
			      return null;
			    } else {
			          return "page1-template";
			    
		}
	}
	

//	private String nome;
//	private String senha;
//	
//	public String doLogin() {
//		if ("rayssa".equals(nome) && "rayssa".equals(senha)) {
//			return "page1-template";
//		}
//		
//		return null;
//	}
//	
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
//	}
//	
	
}