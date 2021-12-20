package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TestandoListaDeAula {

	public static void main(String[] args) {
//		Aula a1 = new Aula("Revisando as ArrayLists", 21);
//		Aula a2 = new Aula("Listas de Objetos", 15);
//		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(new Aula("Revisando as ArrayLists", 21));
		aulas.add(new Aula("Listas de Objetos", 20));
		aulas.add(new Aula("Relacionamento de listas e objetos", 15));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		aulas.sort((Comparator.comparing(Aula::getTitulo))); // Vei q viagem da poha
	}

}
