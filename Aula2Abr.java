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
		int índiceMenor = 0;
		for(int i = j; i < valores.length; i++) {
		if(valores[i] < menor) {
        	menor = valores[i];
        	índiceMenor = i;
        }
	}
		valores[índiceMenor] = valores[j];
		valores[j] = menor;
		}
	}
}