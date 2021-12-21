package br.com.alura.teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculados = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculados);
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos.size());
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		System.out.println(alunosEmLista);
		
	}

}
