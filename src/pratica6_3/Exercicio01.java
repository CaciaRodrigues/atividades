package pratica6_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		// Iniciando o scanner e mudando a localidade para aceitar .00
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		float salario;
		float abono;
		
		System.out.printf("Diginte o Salário: ");
		salario = ler.nextFloat();
		
		System.out.printf("Digite o Abono: ");
		abono = ler.nextFloat();
		
		float novoSalario = salario + abono;
		
		ler.close(); // Fechando o scanner
		
		System.out.printf(Locale.US,"Novo Salário: $%.2f", novoSalario);
		
	}
}
