package Aula2Abr;

public class Aula2Abr {
	public static void main(String[] args) {
int valores[] = {7,6,9,4,3,6};
sort(valores);
imprime(valores);

}

	private static void imprime(int[] valores) {
		for (int i : valores)
			System.out.println(i + " ");
	}
	
	private static void sort(int[] valores) {
	for(int j  = 0; j < valores.length; j++) {
		int menor = Integer.MAX_VALUE;
		int �ndiceMenor = 0;
		for(int i = j; i < valores.length; i++) {
		if(valores[i] < menor) {
        	menor = valores[i];
        	�ndiceMenor = i;
        }
	}
		valores[�ndiceMenor] = valores[j];
		valores[j] = menor;
		}
	}
}