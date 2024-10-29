package pratica7_2;

import java.util.Scanner;

public class LacoIf02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = leitor.nextInt();
		
		if (numero % 2 == 0 && numero != 0) {
			if ( numero > 0) {
				System.out.printf("O Número %d é par e positivo!", numero);
			}
			else {
				System.out.printf("O Número %d é par e negativo!", numero);
			}
		}
		else if (numero % 2 != 0 && numero != 0) {
			if (numero > 0) {
				System.out.printf("O Número %d é impar e positivo!", numero);
			}
			else {
				System.out.printf("O Número %d é impar e negativo!", numero);
			}
		}
		else {
			System.out.printf("O Número %d é considerado um matematicamente um número par, porém não é negativo nem positivo, é um número neutro!", numero);
		}
		
		leitor.close();

	}

}
