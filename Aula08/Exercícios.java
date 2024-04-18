package Aula08;

public class Exercícios {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		int a = 7;
		
		/*boolean aprovado;
		if(a >= 7) {
			aprovado = true;
		}
		else {
		aprovado = false;	
		}*/
String aprovado = (a>=7) ? "Aprovado" : "Reprovado";
System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
System.out.println(fila.início());
System.out.println(fila.desenfileirar());
fila.enfileirar("Maria");
fila.enfileirar("Ana");
fila.enfileirar("Marcelo");
System.out.println(fila.estaVazia() ? "Vazia" : "Não vazia");
System.out.println(fila.início());
System.out.println(fila.desenfileirar());
System.out.println(fila.início());
	}
private static void imprimeFila(Fila fila) {
	Object info = fila.desenfileirar();
	
	while(info != null) {
		System.out.println(info);
		info = fila.desenfileirar();

	}
}}
