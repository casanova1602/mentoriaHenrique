package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite um número: (Digite '-1' para sair)");
		int numero = scr.nextInt();
		int nums = 0;
		int soma = 0;
		while(numero >= 0 || numero < -1) {
			nums++;
			soma += numero;
			System.out.println("Digite um outro número: (Digite '-1' para sair)");
			numero = scr.nextInt();
		}
		if(nums==0) {
			System.out.println("Nada somado");
		}
		System.out.println(soma/nums);
		scr.close();
	}
}
