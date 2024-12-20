package pratica7_2;

import java.util.Scanner;

public class LacoSwitch02 {

	public static void main(String[] args) {
		
		System.out.println("-+-+-+-+-+-+-+-+-+- Quadro de Reajustes -+-+-+-+-+-+-+-+-+-+"
				 		 + "\n| Código do Cargo | Cargo         | Percentual do Reajuste |"
				 		 + "\n------------------------------------------------------------"
				 		 + "\n| 1               | Gerente       | 10%                    |"
				 		 + "\n| 2               | Vendedor      | 7%                     |"
				 		 + "\n| 3               | Supervisor    | 9%                     |"
				 		 + "\n| 4               | Motorista     | 6%                     |"
				 		 + "\n| 5               | Estoquista    | 5%                     |"
				 		 + "\n| 6               | Técnico de TI | 8%                     |"
				 		 + "\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Nome do colaborador: ");
		leitor.skip("\\R?"); 
		String nomeColaborador = leitor.nextLine();
		
		System.out.println("Cargo: ");
		int codigoCargo = leitor.nextInt();
		
		System.out.println("Salário: ");
		float salario = leitor.nextFloat();

		float novoSalario;
		
		switch(codigoCargo) {
		case 1:
			novoSalario = salario + ((salario * 10) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Gerente"
							+ "\nSalário: R$%.2f", nomeColaborador, novoSalario);
			break;
		case 2:
			novoSalario = salario + ((salario * 7) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Vendedor"
							+ "\nSalário: R$%.2f", nomeColaborador, novoSalario);
			break;
		case 3:
			novoSalario = salario + ((salario * 9) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Supervisor"
							+ "\nSalário: R$%.2f", nomeColaborador, novoSalario);
			break;
		case 4:
			novoSalario = salario + ((salario * 6) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Motorista"
							+ "\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 5:
			novoSalario = salario + ((salario * 5) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Estoquista"
							+ "\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		case 6:
			novoSalario = salario + ((salario * 8) / 100);
			System.out.printf("Nome do Colaborador: %s"
							+ "\nCargo: Técnico de TI"
							+ "\nSalário: %.2f", nomeColaborador, novoSalario);
			break;
		default:
			System.out.println("Cargo não existe!");
		}
		leitor.close();
	}

}
