package Aula07Mar;
import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double média = 0;
    double soma = 0;
		double[] notas = {1, 5.6, 7.8, 10};
for(var nota : notas) {
	if (nota > 6.5){
System.out.println(nota + " Você tem uma bolsa");
	}
	soma += nota;
	}
média =  soma / notas.length;

System.out.println("A média é " + média);

	}
}
