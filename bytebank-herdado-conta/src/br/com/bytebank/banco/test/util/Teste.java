package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		// Tava mesmo precisando aprender o significado <alguma coisa>.
		ArrayList<Conta> lista = new ArrayList<Conta>();
				
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(22, 11);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 22);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-------------------------");
		
		for(Object o : lista) {
			System.out.println(o);
		}
		
	}

}
