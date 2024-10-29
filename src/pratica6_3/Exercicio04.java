package pratica6_3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); // Iniciando o scanner 
		
		System.out.println("numero1: ");
		float numero1 = ler.nextFloat();
		
		System.out.println("numero2: ");
		float numero2 = ler.nextFloat();
		
		System.out.println("numero3: ");
		float numero3 = ler.nextFloat();
		
		System.out.println("numero4: ");
		float numero4 = ler.nextFloat();
		
		ler.close(); //Fechando o scanner
		
		float calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("Cálculo: %.1f", calculo);

	}

}
