package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {

    public static void main(String[] args) {

        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);    
        
        cursos.remove(1);
        cursos.forEach(curso -> System.out.println(curso));
        
        System.out.println("-------------------");
        
        cursos.add(1, curso2);
        cursos.forEach(curso -> System.out.println(curso));
        
        System.out.println("-------------------");
        
        String primeiroCurso = cursos.get(0);
        System.out.println("Primeiro curso: " + primeiroCurso);
        
        System.out.println("-------------------");
        
        Collections.sort(cursos);
        cursos.forEach(curso -> System.out.println(curso));
        
    }
}