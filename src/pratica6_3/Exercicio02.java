package pratica6_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ler.useLocale(Locale.US); // Para a variável aceitar .00
		
		System.out.println("Nota 1: ");
		float nota01 = ler.nextFloat();
		
		System.out.println("Nota 2: ");
		float nota02 = ler.nextFloat();
		
		System.out.println("Nota 3: ");
		float nota03 = ler.nextFloat();
		
		System.out.println("Nota 4: ");
		float nota04 = ler.nextFloat();
		
		float notaMedia = (nota01 + nota02 + nota03 + nota04) / 4;
		System.out.printf("Nota Média: %.1f", notaMedia);
		
	}
}
