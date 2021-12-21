package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new LinkedHashSet<Aluno>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}	
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return "Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", Aulas: " + this.aulas + "]";
	}
	
}
