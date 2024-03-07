package Aula07Mar;
import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); {
    	System.out.println("Digite o número de vezes");
    	int vzs = scan.nextInt();
		int atual = 1;
		int anterior = 0;
		for(int i = 0; i <= vzs; i++) {
		atual = anterior + atual;
		anterior = atual - anterior;
		System.out.println(atual);
    }
    }
    /* ou  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); {
        	System.out.println("Digite o número de vezes");
        	int vzs = scan.nextInt();
    		int atual = 1;
    		int anterior = 0;
    		int prx;
    		for(int i = 0; i <= vzs; i++) {
    		prox = anterior + atual;
    		anterior = atual;
    		System.out.println(atual);
atual = prox;	
	*/}
}
