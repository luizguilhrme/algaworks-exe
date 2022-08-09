package com.algaworks.java.enums;

public class TesteOperacaoEnum {
	public static void main(String[] args) {
	OperacaoAritmetica oa1 = OperacaoAritmetica.ADICAO;
	int resultado1 = oa1.operacao(5, 3);
	System.out.println("o resultado é " + resultado1);

	for(OperacaoAritmetica oa : OperacaoAritmetica.values()) {
		System.out.println(oa + " -> " + oa.operacao(4, 2));
	}
	}
	
}
