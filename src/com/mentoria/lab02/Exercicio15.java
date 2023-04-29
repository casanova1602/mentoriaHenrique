package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);

		System.out.println("Digite um número entre 1 e 10");
		int numero = scr.nextInt();
		while(numero<=0 || numero >10) {
			System.out.println("Número Inválido. Digite um número entre 1 e 10");
			numero = scr.nextInt();
		}
		for(int i=0; i<11;i++) {
			System.out.println(numero + " X " + i + " = " + numero * i);
		}
		scr.close();
	}
}
