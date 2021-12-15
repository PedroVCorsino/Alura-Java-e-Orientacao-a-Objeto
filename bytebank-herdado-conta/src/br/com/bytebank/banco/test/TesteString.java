package br.com.bytebank.banco.test;

import java.util.concurrent.SynchronousQueue;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		System.out.println(vazio.trim().isEmpty());
		
		String nome = "Alura"; // Object literal
		//String outro = new String("Alura"); // Como instanciar um objeto normal.
		
		//Strings não podem ser alteradas, são imutaveis!
		
		nome.replace("A", "a"); // Não funciona
		nome.toLowerCase();    // Tbm não

		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';
//		String b = nome.replace(c, d);
//		
//		
//		String outra = nome.replace("A", "a");
//		
//		System.out.println(b);
		System.out.println(nome);
//		System.out.println(outra);
	}

}
