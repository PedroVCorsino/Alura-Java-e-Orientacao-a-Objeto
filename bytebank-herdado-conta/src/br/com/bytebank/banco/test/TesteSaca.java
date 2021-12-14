package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteExcepition;

public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new ContaCorrente(123, 123);
		
		conta.deposita(200.0);
		try {
			conta.saca(200.0);
		} catch (SaldoInsuficienteExcepition e) {
			System.out.println("e: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
