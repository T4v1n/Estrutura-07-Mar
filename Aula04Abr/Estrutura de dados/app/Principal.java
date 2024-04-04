package app;

import Aula07.Pilha;

public class Principal {

	public static void main(String[] args) {
    historico();
	}

	private static void historico() {
		Pilha pilha = new Pilha(); //Criando um novo objeto da classe Pilha
		System.out.println(pilha.estaVazia());  //retorna o true ou false se a pilha estiver ou não vazia
		pilha.empilhar("g1.com"); 
		pilha.empilhar("bb.com");      //empilha essas duas Strings á pilha (por bb.com ser a última, ela está no topo)
	
		Object info = pilha.desempilhar(); //Usa o método para desempilhar e o armazena em info
		while(info != null) {              //Um loop que executará o desempilhar enquanto houver elementos na pilha
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
		System.out.println(pilha.topo());           //Semelhante ao método de cima, porém sem o loop
	} 
	
	

}
