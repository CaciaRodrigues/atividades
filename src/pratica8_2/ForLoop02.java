package pratica8_2;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		int numero = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %d° número: ", i);
			numero = leitor.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			} 
			else {
				impares++;
			}
		}
		System.out.printf("\nTotal de números pares: %d"
				        + "\nTotal de números ímpares: %d", pares, impares);
		leitor.close();

	}

}
