package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		
		//Padrao Decorator.
		
		FileInputStream fis = new FileInputStream("lorem-ipsum"); //le o arquivo, retorna binario.
		InputStreamReader isr = new InputStreamReader(fis); //Trasforma o binario em caractere.
		BufferedReader br = new BufferedReader(isr); //Junta os caracteres.
		
		String linha = br.readLine(); //le as linhas
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
	}

}
