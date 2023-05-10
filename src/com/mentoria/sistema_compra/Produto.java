package com.mentoria.sistema_compra;

public class Produto {

	String nome;
	Double preco;
	Integer quantidade;
	
	public Produto (String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto (String nome, Integer quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
}
