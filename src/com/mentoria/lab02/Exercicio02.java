package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		System.out.println("Digite um número:");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
		scanner.close();
	}
}
