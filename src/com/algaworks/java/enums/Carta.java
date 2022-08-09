package com.algaworks.java.enums;

public class Carta {
	private int numero;
	private Naipe naipe;
	
	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
		
	}
	public void imprimirCarta() {
		System.out.println("sou " + numero + " de " + naipe + " e tenho a cor " + naipe.getCor());
	}
}
