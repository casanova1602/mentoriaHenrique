package com.mentoria.lab02;

public class Exercicio09 {
	public static void main(String[] args) {
		
		int i = 1;
		int soma = 0;
		while(i<=100) {
			if(i%2==1) {
				soma+=i;
				i++;
			}
			i++;
		}
		
		System.out.println(soma);
	}
}
