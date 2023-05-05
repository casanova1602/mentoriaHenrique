package com.mentoria.Enum3;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Digite um Mês: ");
		String mes = scr.next().toUpperCase();
		
		Mes.getTrimestre(Mes.valueOf(mes));
		
		scr.close();
	}
}
