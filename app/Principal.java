package app;

import Aula07.Pilha;

public class Principal {

	public static void main(String[] args) {
    historico();
	}

	private static void historico() {
		Pilha pilha = new Pilha();
		System.out.println(pilha.estaVazia());
		pilha.empilhar("g1.com");
		pilha.empilhar("bb.com");
	
		Object info = pilha.desempilhar();
		while(info != null) {
			System.out.println(info);
			info = pilha.desempilhar();
		}
	}
	
	private static void exemplo() {
		Pilha pilha = new Pilha();
		System.out.println(pilha.estaVazia());
		pilha.empilhar("g1.com");
		pilha.empilhar("bb.com");
		System.out.println(pilha.estaVazia());
		System.out.println(pilha.topo());
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.topo());
	} 
	
	

}
