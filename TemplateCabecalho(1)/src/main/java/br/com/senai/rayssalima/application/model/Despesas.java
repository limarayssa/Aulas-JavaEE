package br.com.senai.rayssalima.application.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Despesas {
//atributos primitivos não podem ser nulos, por isso usamos os wrappers (com a inicial maiúscula) 
@Id
@GeneratedValue
private Integer id;
private String data;
private String descricao;
private Integer valor;
private Boolean edit;

public String getData() {
	return data;
}


public Despesas(String data, String descricao, Integer valor) {
	super();
	this.data = data;
	this.descricao = descricao;
	this.valor = valor;
}

//getter e setter vazio para a entidade não dar erro
public Despesas() {
}


public void setData(String data) {
	this.data = data;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Integer getValor() {
	return valor;
}
public void setValor(Integer valor) {
	this.valor = valor;
}
public Boolean getEdit() {
	return edit;
}
public void setEdit(Boolean edit) {
	this.edit = edit;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
	
}
