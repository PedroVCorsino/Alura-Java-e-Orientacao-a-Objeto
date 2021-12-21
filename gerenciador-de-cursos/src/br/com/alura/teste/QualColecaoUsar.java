package br.com.alura.teste;

import java.util.Collection;
import java.util.HashSet;

import br.com.alura.modelo.Aluno;

public class QualColecaoUsar {

	public static void main(String[] args) {
		Collection<Aluno> alunos = new HashSet<>();
		alunos.add(null);
		alunos.size();
		
	}

}
