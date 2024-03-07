package Aula07Mar;
import java.util.Scanner;
public class Exercício4 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de vezes");
    int[] valores = new int[1000];
    int casa = scan.nextInt(); 
	valores[0] = 1;
	valores [1] = 1;
      
    for(int i = 2; i <= casa; i++) {
    	valores[i] = valores[i - 1] + valores[i - 2];
    	System.out.println(valores[i] + " ");
    }
	}

}
