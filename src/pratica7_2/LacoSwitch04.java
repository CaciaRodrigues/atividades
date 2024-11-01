package pratica7_2;

import java.util.Scanner;

public class LacoSwitch04 {

	public static void main(String[] args) {
				
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(
				"Bem Vindo(a)! o que deseja fazer hoje?"
				+ "\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n"
				+ "\n-----------------"
				+ "\n|   Operações   |"
				+ "\n-----------------"
				+ "\n| 1  -  Saldo   |"
				+ "\n| 2  -  Saque   |"
				+ "\n| 3  - Depósito |"
				+ "\n-----------------");
		
		float saldo = 1000;
		float valorOperacao = 0;
		
		System.out.print("Operação: ");
		int operacao = leitor.nextInt();

		switch(operacao) {
		case 1:
			System.out.printf("Operação - Saldo \nSaldo: R$ %.2f", saldo);
			break;
			
		case 2:
			System.out.print("Valor: ");
			valorOperacao = leitor.nextFloat();
			System.out.println("Operação - Saque");
			if (valorOperacao > saldo) {
				System.out.println("Saldo Insuficiente!");
			}
			else {
				saldo -= valorOperacao;
				System.out.printf("Novo Saldo: R$ %.2f", saldo);
			}
			break;
			
		case 3:
			System.out.print("Valor: ");
			valorOperacao = leitor.nextFloat();
			saldo += valorOperacao;
			System.out.printf("Operação - Depósito \nNovo Saldo: R$ %.2f", saldo);
			break;
			
		default:
			System.out.println("Operação Inválida!");
		}
		
		leitor.close();
	}

}
