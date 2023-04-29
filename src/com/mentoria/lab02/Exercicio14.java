package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scr.nextInt();
		
		do {
			if(numero%2==0) {
				System.out.print(numero + " ");
				numero--;				
			}
			numero--;
		} while(numero>=0);
		scr.close();
	}
}
