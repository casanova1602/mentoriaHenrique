package com.mentoria.formulario;

public class Pergunta9 {

	public static void main(String[] args) {

		String str1 = "foo";
		String str2 = "bar";
		String str3 = str1.concat(str2);
		String str4 = "foobar";
		System.out.println(str3 == str4);
 		System.out.println(str3.equals(str4));
	}
}