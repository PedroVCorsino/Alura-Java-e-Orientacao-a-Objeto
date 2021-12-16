package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		
		Conta [] contas = new Conta[2];
		
		ContaCorrente cc1 =  new ContaCorrente(1111, 1111111);
		ContaPoupanca cc2 =  new ContaPoupanca(2222, 2222222);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		ContaPoupanca refs = (ContaPoupanca) contas[1]; //type cast
		
		System.out.println(contas[0].toString());
		System.out.println(contas[1].toString());
		System.out.println(refs.toString());
	}

}
