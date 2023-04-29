package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio05 {

	public static void contarVogais() {
		System.out.println("Digite uma palavra:");

		Scanner scn = new Scanner(System.in);

		String palavra = scn.nextLine();

		int vogais = 0;

		int total = palavra.length();

		for (int i = 0; i < total; i++) {
			if (String.valueOf(palavra.charAt(i)).equalsIgnoreCase("a")
					|| String.valueOf(palavra.charAt(i)).equalsIgnoreCase("e")
					|| String.valueOf(palavra.charAt(i)).equalsIgnoreCase("i")
					|| String.valueOf(palavra.charAt(i)).equalsIgnoreCase("o")
					|| String.valueOf(palavra.charAt(i)).equalsIgnoreCase("u")) {
				vogais += 1;
			}

		}
		System.out.println(vogais);
		scn.close();
	}

}