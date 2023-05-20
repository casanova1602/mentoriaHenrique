package com.mentoria.formpessoa;

public class Pessoa {
	private String nome;
	private Integer idade;
	private Double altura;
	
	Pessoa(String nome, Integer idade, Double altura){
		this.nome = nome;
		this.idade= idade;
		this.altura = altura;
	}
	
	public void imprimeAtributos() {
		System.out.printf(this.nome + " - " + this.idade + " - " + "%.2f", this.altura);
	}
}
