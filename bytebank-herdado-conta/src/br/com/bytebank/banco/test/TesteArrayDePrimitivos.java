package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
	//Array []
	public static void main(String[] args) {
		
		int [] idades = new int[5]; //inicializa o array com valor padrao.
		
		int number = 1;
		for (int i = 0; i < idades.length; i++) {
			String idadeStr = ++number + "9"; 
			idades[i] = Integer.parseInt(idadeStr);
			System.out.println(idades[i]);
		}
		
		
	}

}
