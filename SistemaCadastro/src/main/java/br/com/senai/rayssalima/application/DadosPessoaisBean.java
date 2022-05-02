package br.com.senai.rayssalima.application;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

@SuppressWarnings("serial")
@Named("cad")
@RequestScoped
public class DadosPessoaisBean implements Serializable{	

private Pessoas pessoas;

public Pessoas getPessoas() {
	if (pessoas == null) {
		pessoas = new Pessoas();
		pessoas.setEnderecoResidencial(new Endereco());
		pessoas.getEnderecoResidencial().setEstado(new Estado());
		pessoas.setEnderecoComercial(new Endereco());
		pessoas.getEnderecoComercial().setEstado(new Estado());
		pessoas.setTelefoneResidencial(new Telefone());
		pessoas.setTelefoneCelular(new Telefone());
	}
	return pessoas;
}
	
}
