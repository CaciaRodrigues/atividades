package pratica8_2;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int somaPositivos = 0;
		int numero = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leitor.nextInt();
			
			if (numero > 0) {
				somaPositivos += numero;
			}
		} while (numero != 0);
		
		System.out.printf("A soma dos números positivos é: %d", somaPositivos);
		
		leitor.close();

	}

}
