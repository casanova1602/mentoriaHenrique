package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Escolha uma palavra: ");
		String palavra = scr.next();
		
		while(!palavra.equalsIgnoreCase("sair")) {
			int vogais = 0;
			for(int i=0; i<palavra.length(); i++) {
				if(String.valueOf(palavra.charAt(i)).equalsIgnoreCase("a") || String.valueOf(palavra.charAt(i)).equalsIgnoreCase("e")|| 
						String.valueOf(palavra.charAt(i)).equalsIgnoreCase("i") || String.valueOf(palavra.charAt(i)).equalsIgnoreCase("o") ||
						String.valueOf(palavra.charAt(i)).equalsIgnoreCase("u") ) {
					vogais++;
				}
			}
			System.out.println(vogais);
			System.out.println("Escolha uma palavra: ");
			palavra = scr.next();
		}
		System.out.println("Tchau!");
		scr.close();
	}
}
