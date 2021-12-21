package br.com.alura.teste;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterador {

	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		Iterator<String> i = letras.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});

	}

}
