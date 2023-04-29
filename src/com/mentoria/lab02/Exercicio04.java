package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		System.out.println("Digite uma palavra:");

		Scanner scn = new Scanner(System.in);

		String palavra = scn.nextLine();

		int quant = palavra.length();

		for (int i = quant - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
		scn.close();
	}
}
