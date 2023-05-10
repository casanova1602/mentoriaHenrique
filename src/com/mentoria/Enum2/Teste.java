package com.mentoria.Enum2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		
		Set<String> cores = new HashSet<String>();
		cores.add("VERMELHO");
		cores.add("VERDE");
		cores.add("AZUL");
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Digite duas cores para retornar a mistura: (Vermelho - Verde - Azul)");
		
		String cor1 = scr.next().toUpperCase();
		String cor2 = scr.next().toUpperCase();
		
		while(!cores.contains(cor1) || !cores.contains(cor2)) {
			System.out.println("Cor incorreta. Seleciona uma cor entre Vermelho - Verde - Azul");
			 cor1 = scr.next().toUpperCase();
			 cor2 = scr.next().toUpperCase();
		}
		
		Cor.misturar(Cor.AZUL, Cor.VERDE);
		scr.close();
	}
}
