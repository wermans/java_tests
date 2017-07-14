package br.com.caelum.testes;

import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

public class TestaPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando...");
		
		Collection<Integer> teste = new ArrayList();
		int total = 70000;
		
		long inicioadd = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fimadd = System.currentTimeMillis();
		long tempoadd = fimadd - inicioadd;
		
		long iniciobusca= System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fimbusca= System.currentTimeMillis();
		
		long tempobusca = fimbusca - iniciobusca;
		System.out.println("Tempo gasto" + tempoadd);
		System.out.println("Tempo gasto" + tempobusca);
		/*
Iniciando...
Tempo gasto48
Tempo gasto26
Iniciando...
Tempo gasto18
Tempo gasto4690
--
Iniciando...
Tempo gasto17
Tempo gasto4904
		 * */
	}
//com arrayList 4575
//com HashSet   58
}