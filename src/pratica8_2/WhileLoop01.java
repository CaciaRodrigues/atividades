package pratica8_2;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leitor.nextInt();
			
			if (idade <= 21 && idade >  0) {
				menos21++;
			}
			
			if (idade >= 50) {
				mais50++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21: %d "
				        + "\nTotal de pessoas maiores de 50: %d", menos21, mais50);
		leitor.close();

	}

}
