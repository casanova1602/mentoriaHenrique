package com.mentoria.lab01;

public class Teste {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Andr�", "andre@teste.com.br");
		
		Pessoa pessoa2 = pessoa1;
		
		
		System.out.println(pessoa1.imprimirNomeEmailComRetorno());
		
		System.out.println(pessoa1.calcularIdade(25));
		
		System.out.println(pessoa2.imprimirNomeEmailComRetorno());
		
	}
}
