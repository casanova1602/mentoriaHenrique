package com.mentoria.lab02;

import java.util.Scanner;

public class TesteExercicio07 {
	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		System.out.println("Escreva uma palavra: ");
		String palavra1 = scr.nextLine();
		System.out.println("Escreva o trecho a ser substituido: ");
		String palavra2 = scr.nextLine();
		System.out.println("Escreva o novo trecho: ");
		String palavra3 = scr.nextLine();
		
		Exercicio07.substituirPalavra(palavra1, palavra2, palavra3);
		
		scr.close();
	}
}
