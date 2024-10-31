package pratica8_2;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}
		} while (numero !=0);
		
		float media = soma / (float) contador;
		
		System.out.printf("A média de todos os múltiplos de 3 é: %.1f", media);
		
		leitor.close();

	}

}
