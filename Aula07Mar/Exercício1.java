package Aula07Mar;
import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
		int contador = 0;
		int multiplicação;
		Scanner scan = new Scanner(System.in);
		int número = 1; 
	for (int o = 1; o <=10; o++) {
 for (int i = 1; i<=10; i++) {
	 multiplicação = número * i * o;
	 System.out.print("["+multiplicação+"]"+"\t");
 }
 System.out.println(" ");
	}
	}
}
