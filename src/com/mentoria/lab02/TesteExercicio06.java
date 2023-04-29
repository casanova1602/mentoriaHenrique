package com.mentoria.lab02;

import java.util.Scanner;

public class TesteExercicio06 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String palavra = scr.nextLine();
		
		Exercicio06.converterCamelCase(palavra);
		
		scr.close();
	}
}
