package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		
		ContaCorrente [] contas = new ContaCorrente[2];
		
		ContaCorrente cc1 =  new ContaCorrente(1111, 1111111);
		ContaCorrente cc2 =  new ContaCorrente(2222, 2222222);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].toString());
		System.out.println(contas[1].toString());
	}

}
