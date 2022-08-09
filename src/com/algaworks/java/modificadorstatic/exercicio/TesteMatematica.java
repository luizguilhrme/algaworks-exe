package com.algaworks.java.modificadorstatic.exercicio;

public class TesteMatematica {

		public static void main(String[] args) {
			int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
			System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
			
			double areaCirculo = MatematicaUtil.calcularAreaCirculo(10.8);
			System.out.println("Área do círculo: " + areaCirculo);
		}

}
