package pratica8_2;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		int numero01 = leitor.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		int numero02 = leitor.nextInt();
		
		if (numero01 > numero02) {
			System.out.println("Intervalo Inváldo! O primeiro número deve ser menor que o número final");
		}
		else 
		{
			System.out.printf("No intervalo entre %d e %d:\n\n", numero01, numero02);
			for (int i = numero01; i <= numero02; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("%d é múltiplo de 3 e 5\n", i);
				}
			}
		}
		leitor.close();
		
	}

}
