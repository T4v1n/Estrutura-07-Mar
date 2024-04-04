package Aula07;

public class Pilha {
 private int tamanho;
 private No topo;

public Pilha() {
	tamanho = 0;
	topo = null;
}

public boolean estaVazia() { //verifica se a pilha está vazia e retorna o tamanho 0
	return tamanho == 0;
}

public Object topo() {
  if (estaVazia()) { //ao executar o método acima retorna como null
	  return null;
  }
	return topo.info; 	
}

public Object desempilhar() { 
	  if (estaVazia()) {        
		  return null; 
	  }
	  Object info = topo.info;  //Recebe o valor armazenado do topo da pilha, e o info buscará o dado armazenado no topo
	  topo = topo.next;         //Move a referência topo para o próximo nó da pilha
      tamanho--;                
	  return topo.info; 	    //Retorna a informação atual do topo
}


public void empilhar(Object info) {
	No no = new No(info);       //Cria um novo objeto da classe No
	no.next = topo;             //Define o próximo nó como topo, colocando-o acima do atual
	topo = no;                  //Define este novo nó como topo
	tamanho++;
}
