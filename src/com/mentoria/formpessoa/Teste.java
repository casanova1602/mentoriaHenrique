package com.mentoria.formpessoa;

import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Pessoa p = new Pessoa("João", 30, 1.80);
		
		p.imprimeAtributos();
		
	}
}
