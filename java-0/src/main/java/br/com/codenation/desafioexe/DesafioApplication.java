package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		//Criar uma lista com os primeiro números da série de *Fibonacci* até *passar* de *350*.
		//Os primeiros 2 números da sequência são 0 e 1
		//A série de Fibonacci é calculada somando-se o último número com seu anterior
		int numFibo = 0;
		int contador = 1;
		List<Integer> lFibo = new ArrayList<Integer>(); 
		lFibo.add(0);
		lFibo.add(1);
		
		while (numFibo <= 350) {
			numFibo = lFibo.get(contador) + lFibo.get(contador-1);
			lFibo.add(numFibo);
			contador++;
		}		
		
		return lFibo;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}