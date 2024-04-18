package Aula08;

public class Fila {
private int tamanho;
private No início;
private No fim;

public Fila() {
	this.tamanho = 0;
	this.início = null;
	this.fim = null;
}

public boolean estaVazia(){
		return this.tamanho == 0;	
	}

public Object início() {
	if(estaVazia()) {
	return null;	
	}
	return this.início.info;
}

public void enfileirar(Object info) {
	No no = new No(info);
	if(estaVazia()) {
		this.início = no;
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
		Object info = this.início.info;
		this.início = this.início.prox;
		tamanho--;
		if(estaVazia()) {
			return this.fim = null;
		}
		return info;
	}
}
}
