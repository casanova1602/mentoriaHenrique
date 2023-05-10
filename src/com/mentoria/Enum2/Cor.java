package com.mentoria.Enum2;

public enum Cor {
	
	VERMELHO ("Vermelho", 255, 0, 0),
	VERDE("Verde", 0 , 255, 0),
	AZUL("Azul", 0, 0, 255),
	AMARELO("Amarelo", 255, 255, 0),
	CIANO("Ciano", 0, 255, 255),
	MAGENTA("Magenta", 255, 0, 255);

	private final String nome;
	private final int col1;
	private final int col2;
	private final int col3;
	
	Cor(String nome, int col1, int col2, int col3) {
		this.nome = nome;
		this.col1 = col1;
		this.col2 = col2;
		this.col3 = col3;
	}
	
	public static void misturar(Cor cor, Cor cor2) {
		int cor3col1;
		int cor3col2;
		int cor3col3;
		
		cor3col1 = cor.col1 + cor2.col1;
		cor3col2 = cor.col2 + cor2.col2;
		cor3col3 = cor.col3 + cor2.col3;
		
		for(Cor c : Cor.values()) {
			if(c.col1 == cor3col1 && c.col2 == cor3col2 && c.col3 == cor3col3) {
				System.out.println("A cor misturada é: " + c.nome);
			}
		}
	}
	
}
