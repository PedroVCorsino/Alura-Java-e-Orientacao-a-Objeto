package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeArrays;

public class TesteGuardadorDeArrays {

	public static void main(String[] args) {
		
		GuardadorDeArrays guardador = new GuardadorDeArrays();
		
		Conta cc = new ContaCorrente(22, 11);		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(23, 12);		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Object ref = guardador.getReferencia(0);
		System.out.println(ref);
		

	}	
}
