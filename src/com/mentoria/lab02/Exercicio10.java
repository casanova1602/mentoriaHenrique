package com.mentoria.lab02;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		String senha = "1234";
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		String senhaUsuario = scr.next();
		
		while(!senhaUsuario.equals(senha)) {
			System.out.println("Senha Incorreta. Digite a senha: ");
			senhaUsuario = scr.next();
		}
		
		System.out.println("Senha Correta");
		scr.close();
	}
}
