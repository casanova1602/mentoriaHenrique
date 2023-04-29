package com.mentoria.lab02;

import java.util.Scanner;

public class TesteExercicio08 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int num1 = scr.nextInt();
		int num2 = scr.nextInt();

		Exercicio08.maiorNumero(num1, num2);
		scr.close();
	}

}