package com.mentoria.Enum1;

public enum Planetas {
	
	NETUNO ("Netuno", 4504300000L),
	URANO ("Urano", 2870990000L),
	SATURNO ("Saturno", 1429400000),
	JUPITER ("Júpiter", 778330000),
	MARTE ("Marte", 227940000),
	TERRA ("Terra", 149600000),
	VENUS ("Vênus", 108200000),
	MERCURIO ("Mercúrio", 57910000);
	
	private final String nome;
	private final Long distancia;
	

	Planetas(String nome, long distancia) {
		this.nome = nome;
		this.distancia = distancia;
	}
	

	public static void getDistancia(Planetas planeta) {
		
		System.out.println("A distância entre o planeta " + planeta.nome + " é: " + planeta.distancia);
	}
	
	

}
