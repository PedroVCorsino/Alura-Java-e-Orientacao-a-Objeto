package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestandoPerformace {

    public static void main(String[] args) {
    	    	
        Collection<Integer> numerosList = new ArrayList<Integer>();

    	long inicioList = System.currentTimeMillis();
        
        for (int i = 1; i <= 50000; i++) {
            numerosList.add(i);
        }

        for (Integer numero : numerosList) {
            numerosList.contains(numero);
        }

        long fimList = System.currentTimeMillis();

        long tempoDeExecucaoList = fimList - inicioList;
        
        System.out.println("Tempo gasto da lista: " + tempoDeExecucaoList);
        
        Collection<Integer> numerosSet = new HashSet<>();
        
        long inicioSet = System.currentTimeMillis();
        
        for (int i = 1; i <= 50000; i++) {
            numerosList.add(i);
        }

        for (Integer numero : numerosSet) {
            numerosSet.contains(numero);
        }

        long fimSet = System.currentTimeMillis();

        long tempoDeExecucaoSet = fimSet - inicioSet;

        System.out.println("Tempo gasto do set: " + tempoDeExecucaoSet);

    }
}
