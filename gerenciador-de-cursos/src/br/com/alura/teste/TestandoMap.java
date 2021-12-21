package br.com.alura.teste;

import java.util.HashMap;
import java.util.Map;

public class TestandoMap {

	public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...
        
        nomesParaIdade.keySet().forEach(nome -> System.out.println(nome));
        nomesParaIdade.values().forEach(nome -> System.out.println(nome));
        
        
    }
    

}
