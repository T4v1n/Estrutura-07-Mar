package Aula07Mar;
import java.util.Scanner;
public class Exercício2 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um valor");
    int valor = scan.nextInt();
    
for(int i = 1; i<=valor; i++) {
	for(int o = 1; o<=i; o++){
	System.out.println(i+"\t");
}
	System.out.println(" ");
}

	}

}
