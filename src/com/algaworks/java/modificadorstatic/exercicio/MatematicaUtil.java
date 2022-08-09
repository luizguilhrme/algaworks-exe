package com.algaworks.java.modificadorstatic.exercicio;

public class MatematicaUtil {
	// http://pt.wikipedia.org/wiki/Número_de_Fibonacci
		public final static double PI = 3.14;
		
		public static int calcularFibonacci(int posicao) {
			if (posicao < 2) {
				return posicao;
			}
			return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
		}
		
		public static double calcularAreaCirculo(double raio) {
			double area = raio*raio*MatematicaUtil.PI; 
			return area;	
		}
		
}
