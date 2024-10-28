package pratica6_3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ler.useLocale(Locale.US); // Para a variável aceitar .00
		
		System.out.println("Salário Bruto: ");
		float salarioBruto = ler.nextFloat();
		
		System.out.println("Adicional Noturno: ");
		float adicionalNoturno = ler.nextFloat();
		
		System.out.println("Horas Extras: ");
		float horasExtras = ler.nextFloat();
		
		System.out.println("Desconstos: ");
		float descontos = ler.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("Salário Líquido: R$%.2f", salarioLiquido);
		

	}

}
