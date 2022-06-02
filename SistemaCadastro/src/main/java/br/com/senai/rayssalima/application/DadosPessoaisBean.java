package br.com.senai.rayssalima.application;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.rayssalima.application.states.Interesse;


@SuppressWarnings("serial")
@Named("cad")
@SessionScoped
public class DadosPessoaisBean implements Serializable{	

private Pessoas pessoas;
//atribui os dados ao objeto pessoa
public Pessoas getPessoas() {
	if (pessoas == null) {
		pessoas = new Pessoas();
		pessoas.setEnderecoResidencial(new Endereco());
		pessoas.getEnderecoResidencial().setEstado(new Estado());
		pessoas.setEnderecoComercial(new Endereco());
		pessoas.getEnderecoComercial().setEstado(new Estado());
		pessoas.setTelefoneResidencial(new Telefone());
		pessoas.setTelefoneCelular(new Telefone());
		pessoas.setTelefoneComercial(new Telefone());
	}
	return pessoas;
}

	public List<Estado> getEstados() {
	return Lista.ESTADOS;
}

	public List<Interesse> getInteresses() {
	return Lista.INTERESSES;
}
	
}
