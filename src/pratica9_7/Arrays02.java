package pratica9_7;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int tamanho = 10; // declarando uma variável para ser utilizada repetidamente
		int listaNum[] = new int[tamanho];
		int soma = 0;
		
		System.out.println("-+-+-Monte um vetor com 10 números-+-+-\n");
		
		for (int i = 0; i < tamanho; i++) {
			System.out.printf("Digite o %d° elemento: ", i + 1);
			listaNum[i] = leitor.nextInt();
			soma += listaNum[i];
		}
		
		// Convertendo a variável tamanho de int para float somente na instância necessária
		float media = soma / (float) tamanho;
		
		System.out.printf("O seu vetor completo: \n%s",Arrays.toString(listaNum));
		
		System.out.println("\nElementos nos índices ímpares: ");
		for(int i = 0; i < tamanho; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", listaNum[i]);
			}
		}
		
		System.out.println("\nElementos pares: ");
		for(int j = 0; j < tamanho; j++) {
			if(listaNum[j] % 2 == 0) {
				System.out.printf("%d ", listaNum[j]);
			}
		}
		
		System.out.printf("\nSoma: %d \nMédia: %.2f", soma, media);
		
		
		leitor.close();

	}

}
