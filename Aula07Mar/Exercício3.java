package Aula07Mar;
import java.util.Scanner;
public class Exerc�cio3 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double m�dia = 0;
    double soma = 0;
		double[] notas = {1, 5.6, 7.8, 10};
for(var nota : notas) {
	if (nota > 6.5){
System.out.println(nota + " Voc� tem uma bolsa");
	}
	soma += nota;
	}
m�dia =  soma / notas.length;

System.out.println("A m�dia � " + m�dia);

	}
}
