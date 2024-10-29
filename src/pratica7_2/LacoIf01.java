package pratica7_2;

import java.util.Scanner;

public class LacoIf01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		int numeroA = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		int numeroB = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		int numeroC = ler.nextInt();
		
		int soma = numeroA + numeroB;
		
		if ( soma > numeroC)
		{
			System.out.printf("%d + %d = %d > %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é maior do que C");
		} 
		else if (soma < numeroC)
		{
			System.out.printf("%d + %d = %d < %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é Menor do que C");
		}
		else
		{
			System.out.printf("%d + %d = %d = %d\n", numeroA, numeroB, soma, numeroC);
			System.out.println("A soma de A + B é Igual do que C");
		}
		
		ler.close();
	}

}
