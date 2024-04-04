package Aula07;

public class Pilha {
 private int tamanho;
 private No topo;

public Pilha() {
	tamanho = 0;
	topo = null;
}

public boolean estaVazia() { //verifica se a pilha está vazia e retorna o tamanho como 0
	return tamanho == 0;
}

public Object topo() {
  if (estaVazia()) { //se o topo retornar 0 o declara como null
	  return null;
  }
	return topo.info; 	
}

public Object desempilhar() {
	  if (estaVazia()) {
		  return null;
	  }
	  Object info = topo.info;
	  topo = topo.next;
      tamanho--;
	  return topo.info; 	
}


public void empilhar(Object info) {
	No no = new No(info);
	no.next = topo;
	topo = no;
	tamanho++;
}
