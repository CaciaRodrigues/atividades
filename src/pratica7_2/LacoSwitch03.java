package pratica7_2;

import java.util.Scanner;

public class LacoSwitch03 {

	public static void main(String[] args) {
		//ler dois numeros float
		// ler o código da operação desejada (int)
		// montar a operação
		//mostrar operação e resultado
		// caso operação invalida mostrar mensagem
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(
				"-+-Calculadora  Simples-+-"
			  + "\n--------------------------"
			  + "\n| Código | Operação      |"
			  + "\n--------------------------"
			  + "\n| 1      | Soma          |"
			  + "\n| 2      | Subtração     |"
			  + "\n| 3      | Multiplicação |"
			  + "\n| 4      | Divisão       |"
			  + "\n-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		System.out.println("Digite o 1° número: ");
		float numero1 = leitor.nextFloat();
		
		System.out.println("Digite o 2° número: ");
		float numero2 = leitor.nextFloat();
		
		System.out.println("Operação: ");
		int operacao = leitor.nextInt();
		
		float resultado = 0;
		
		
		switch(operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		leitor.close();

	}

}
