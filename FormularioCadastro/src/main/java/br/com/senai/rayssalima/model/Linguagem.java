package br.com.senai.rayssalima.model;

public class Linguagem {
	
	private Integer id;
	private String nome;
	
	public static final Linguagem [] LINGUAGENS;
	
	static {
		LINGUAGENS = new Linguagem[5];
		LINGUAGENS[0] = new Linguagem(1, "Java");
		LINGUAGENS[1] = new Linguagem(2, "IOS");
		LINGUAGENS[2] = new Linguagem(1, "C++");
		LINGUAGENS[3] = new Linguagem(1, "Java");
		LINGUAGENS[4] = new Linguagem(1, "Java");
	}
	
}
