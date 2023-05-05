package com.mentoria.formulario;

public class Pergunta6 {

	public static void main(String[] args) {

		String str1 = "foo";
		String str2 = "FOO";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
