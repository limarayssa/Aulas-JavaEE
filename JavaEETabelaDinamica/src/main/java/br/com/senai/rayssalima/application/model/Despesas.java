package br.com.senai.rayssalima.application.model;

public class Despesas {
//atributos primitivos não podem ser nulos, por isso usamos os wrappers
private String data;
private String descricao;
private Double valor;
private Boolean edit;

public String getData() {
	return data;
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
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Boolean getEdit() {
	return edit;
}
public void setEdit(Boolean edit) {
	this.edit = edit;
}


	
}
