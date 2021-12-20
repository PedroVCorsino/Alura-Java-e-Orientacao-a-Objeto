package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TesteandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com listas";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo");
			System.out.println("Aula: " + aula);	
		});
		
		aulas.add("Aumentando o nosso conhecimento");
		
		Collections.sort(aulas);
		
		System.out.println("--------------------------------------");
		aulas.forEach(aula -> System.out.println("Aula: " + aula));
	}

}
