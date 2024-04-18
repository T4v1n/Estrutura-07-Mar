package Aula08;

public class Fila {
private int tamanho;
private No in�cio;
private No fim;

public Fila() {
	this.tamanho = 0;
	this.in�cio = null;
	this.fim = null;
}

public boolean estaVazia(){
		return this.tamanho == 0;	
	}

public Object in�cio() {
	if(estaVazia()) {
	return null;	
	}
	return this.in�cio.info;
}

public void enfileirar(Object info) {
	No no = new No(info);
	if(estaVazia()) {
		this.in�cio = no;
		}
	else {
    this.fim.prox = no;
	}
	this.fim = no;
    tamanho++;
}

public Object desenfileirar() {
	if(estaVazia()) {
	return null;	
		}
	else {
		Object info = this.in�cio.info;
		this.in�cio = this.in�cio.prox;
		tamanho--;
		if(estaVazia()) {
			return this.fim = null;
		}
		return info;
	}
}
}
