package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		String numero = scr.next();

		int soma = 0;

		for (int i = 0; i < numero.length(); i++) {
			soma += Integer.parseInt(numero.valueOf(numero.charAt(i)));		
		}
		System.out.println(soma);
		scr.close();
	}
}
