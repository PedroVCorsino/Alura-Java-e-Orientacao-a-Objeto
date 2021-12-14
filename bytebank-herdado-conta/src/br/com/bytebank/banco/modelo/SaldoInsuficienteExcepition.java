package br.com.bytebank.banco.modelo;
public class SaldoInsuficienteExcepition extends Exception{
	
	public SaldoInsuficienteExcepition(String msg) {
		super(msg);
	}
}
