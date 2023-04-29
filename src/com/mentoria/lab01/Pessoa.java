package com.mentoria.lab01;

public class Pessoa {

	private String nome;
	private String email;
	
	public Pessoa() {
		System.out.println("Construtor Padr�o");
	}

	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
		System.out.println("Constructor com parametros");
	}
	
	public void imprimirNomeEmail() {
		System.out.println(nome + "-"+ email);
	}
	
	public String imprimirNomeEmailComRetorno() {
		return this.nome + " - " + this.email;
	}
	
	public int calcularIdade(int idade) {
		return idade+10;
	}
}
