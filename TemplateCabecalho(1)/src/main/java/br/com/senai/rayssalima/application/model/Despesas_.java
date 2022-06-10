package br.com.senai.rayssalima.application.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-06-07T15:57:00.922-0300")
@StaticMetamodel(Despesas.class)
public class Despesas_ {
	public static volatile SingularAttribute<Despesas, Integer> id;
	public static volatile SingularAttribute<Despesas, String> data;
	public static volatile SingularAttribute<Despesas, String> descricao;
	public static volatile SingularAttribute<Despesas, Integer> valor;
	public static volatile SingularAttribute<Despesas, Boolean> edit;
}
