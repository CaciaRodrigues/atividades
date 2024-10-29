package pratica6_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ler.useLocale(Locale.US); // Para a variável aceitar .00
		
		float salario;
		float abono;
		
		System.out.printf("Diginte o Salário: ");
		salario = ler.nextFloat();
		
		System.out.printf("Digite o Abono: ");
		abono = ler.nextFloat();
		
		float novoSalario = salario + abono;
		
		ler.close();
		
		System.out.printf("Novo Salário: R$%.2f", novoSalario);
		
	}
}
