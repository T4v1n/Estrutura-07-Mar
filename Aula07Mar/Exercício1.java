package Aula07Mar;
import java.util.Scanner;
public class Exerc�cio1 {

	public static void main(String[] args) {
		int contador = 0;
		int multiplica��o;
		Scanner scan = new Scanner(System.in);
		int n�mero = 1; 
	for (int o = 1; o <=10; o++) {
 for (int i = 1; i<=10; i++) {
	 multiplica��o = n�mero * i * o;
	 System.out.print("["+multiplica��o+"]"+"\t");
 }
 System.out.println(" ");
	}
	}
}
