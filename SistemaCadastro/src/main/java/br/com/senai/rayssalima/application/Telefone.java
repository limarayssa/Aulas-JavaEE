package br.com.senai.rayssalima.application;

public class Telefone {
	
	enum Tipotelefone {
		FIXO, CELULAR;
	}

	private String ddd;
	private String numero;
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
