package br.com.senai.rayssalima.model;

public class Linguagem {
	
	private Integer id;
	private String nome;
	
	public static final Linguagem [] LINGUAGENS;
	
	static {
		LINGUAGENS = new Linguagem[5];
		LINGUAGENS[0] = new Linguagem(1, "Java");
		LINGUAGENS[1] = new Linguagem(2, "IOS");
		LINGUAGENS[2] = new Linguagem(3, "C++");
		LINGUAGENS[3] = new Linguagem(4, "Java");
		LINGUAGENS[4] = new Linguagem(5, "Java");
	}
	
	public Linguagem(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
