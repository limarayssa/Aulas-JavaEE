package br.com.rafaelcosta.application.bean;


import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class FormatterBean implements Serializable {
//esse formato bean transforma o valor, colocando ele com a moeda do local, que é colocada no locale (no caso reais)
//ele tambem transforma o valor em double
	private static final Locale LOCALE_BR = new Locale("pt", "BR");
	
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_BR);
		//escolhe o valor a ser formatado
		return nf.format(valor);
	}
}
