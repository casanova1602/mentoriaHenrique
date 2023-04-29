package com.mentoria.lab02;

import java.util.Scanner;

public class ValidacaoSenha {
	public static void main(String[] args) {
		
		String senhaCorreta = "senha123";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua senha: ");
		
		String senha = input.next();
		
		if(senha.equals(senhaCorreta)) {
			System.out.println("Senha Correta!");
		} else {
			System.out.println("Senha Incorreta");
		}
		
		input.close();
	}
}
