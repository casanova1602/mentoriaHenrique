package com.mentoria.lab02;

public class Exercicio06 {

	public static void converterCamelCase(String palavra) {
		int[] pos = new int[palavra.length()];
		int posArray = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (String.valueOf(palavra.charAt(i)).equals(String.valueOf(palavra.charAt(i)).toUpperCase())) {
				pos[posArray] = i;
				posArray++;
			}
		}

		for (int i = 0; i + 1 <= posArray; i++) {

			if (i == posArray - 1) {
				System.out.print(palavra.substring(pos[i], palavra.length()));
			} else {
				System.out.print(palavra.substring(pos[i], pos[i + 1]) + " ");
			}
		}
	}

}
