package br.com.senai.rayssalima.application;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

import br.com.senai.rayssalima.model.Linguagem;
//Tira o amarelinho
@SuppressWarnings("serial")
//nome do bean
@Named("cadastro")
//A duração da página é só ate o requerimento, depois ele se destrói
@RequestScoped
//serializable converte para bytes 
public class CadastroBean implements Serializable{
	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private Character sexo;
	private Boolean receberEmail;
	private String observacoes;
	private Integer [] linguagens;
	
	//instância da constante
	public Linguagem [] getListaLinguagens() {
		return Linguagem.LINGUAGENS;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmail() {
		return receberEmail;
	}
	public void setReceberEmail(Boolean receberEmail) {
		this.receberEmail = receberEmail;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	// transforma os itens da constante em string
	public String getLinguagensAsString() {
		
		String str = "";
		boolean first = true;
		for (Integer linguagem : linguagens) {
			if(!first) {
				str += ",";
			}
			str += linguagem;
			first = false;
		}
		
		return str;
	}

	
}
