package pratica6_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Iniciando o scanner e mudando a localidade para aceitar .00
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);  
		
		System.out.println("Salário Bruto: ");
		float salarioBruto = ler.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		float adicionalNoturno = ler.nextFloat();
		
		System.out.println("Horas Extras: ");
		float horasExtras = ler.nextFloat();
		
		System.out.println("Desconstos: ");
		float descontos = ler.nextFloat();
		
		ler.close(); // Fechando o scanner
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf(Locale.US,"Salário Líquido: $%.2f", salarioLiquido);
		

	}

}
