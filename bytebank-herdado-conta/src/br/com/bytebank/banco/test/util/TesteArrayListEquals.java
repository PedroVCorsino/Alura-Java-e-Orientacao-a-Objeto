package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		boolean existe = lista.contains(cc3);
		
//		for(Conta conta : lista) {
//			System.out.println((conta.ehIgual(cc3)) ? "existe" : "não existe");
//		}
		
		System.out.println("Ja existe? " + existe);
		
		
//		for(Object o : lista) {
//			System.out.println(o);
//		}
		
	}

}
