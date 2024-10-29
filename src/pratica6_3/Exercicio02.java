package pratica6_3;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); // Iniciando o scanner 
		
		System.out.println("Nota 1: ");
		float nota01 = ler.nextFloat();
		
		System.out.println("Nota 2: ");
		float nota02 = ler.nextFloat();
		
		System.out.println("Nota 3: ");
		float nota03 = ler.nextFloat();
		
		System.out.println("Nota 4: ");
		float nota04 = ler.nextFloat();
		
		ler.close(); // Fechando o scanner
		
		float notaMedia = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.printf("Nota Média: %.1f", notaMedia);
		
	}
}
