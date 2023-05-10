package com.mentoria.lab02;

public class Exercicio06 {

	public static void converterCamelCase(String palavra) {
		final int tamanho = palavra.length();
		for (int i = 0; i < tamanho; i++) {
			if (Character.isUpperCase(palavra.charAt(i))) {
				if (i > 0) {
					palavra = palavra.replace(String.valueOf(palavra.charAt(i)), " " + String.valueOf(palavra.charAt(i)));
					i++;
				}
			}

		}
		
		System.out.println(palavra);
	}
}