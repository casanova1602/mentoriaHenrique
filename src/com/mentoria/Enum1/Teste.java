package com.mentoria.Enum1;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Digite um Planeta: ");
		try {	
		String planeta = scr.nextLine().toUpperCase();
		Planetas.getDistancia(Planetas.valueOf(planeta));
		
		scr.close();
		
		} catch (IllegalArgumentException e) {
			System.out.println("Planeta inexistente. Tente Novamente.");
			
		}
	 scr.close();	
	}
}
