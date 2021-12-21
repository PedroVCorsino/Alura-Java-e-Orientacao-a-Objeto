package br.com.alura.teste;

import java.util.List;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestandoCursoComAluno {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma Aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		curso.getAlunos().forEach(aluno -> System.out.println(aluno));
		
	}

}
