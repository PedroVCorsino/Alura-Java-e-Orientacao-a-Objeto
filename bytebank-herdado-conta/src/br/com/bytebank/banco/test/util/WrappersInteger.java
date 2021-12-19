package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class WrappersInteger {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String [] nomes = new String[5];
		
		int idade = 29; //Integer
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

	}

}
