package com.mentoria.Enum3;

public enum Mes {

	JANEIRO("Janeiro", 1),
	FEVEREIRO("Fevereiro", 1),
	MARCO ("Março", 1),
	ABRIL ("Abril", 2),
	MAIO ("Maio", 2),
	JUNHO ("Junho", 2),
	JULHO ("Julho", 3),
	AGOSTO ("Agosto", 3),
	SETEMBRO ("Setembro", 3),
	OUTUBRO ("Outubro", 4),
	NOVEMBRO ("Novembro", 4),
	DEZEMBRO ("Dezembro", 4);

	private final String mes;
	private final int trimestre;
	
	Mes(String mes, int trimestre) {
		this.mes = mes;
		this.trimestre = trimestre;
	}
	
	public static void getTrimestre(Mes mes) {
		System.out.println("O trimestre do mês de " + mes.mes + " é: " + mes.trimestre);
	}
	
}
