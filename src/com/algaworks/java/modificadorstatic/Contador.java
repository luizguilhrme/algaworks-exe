package com.algaworks.java.modificadorstatic;

public class Contador {
	
	public static int COUNT = 0;
	public final static double PI = 3.14;
	
	
	public void incrementar() {
		COUNT++;
		
	}
	public static void imprimirContador() {
		System.out.println("o valor do contador agora eh: " + Contador.COUNT);
	}
	
}
