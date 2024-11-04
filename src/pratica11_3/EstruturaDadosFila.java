package pratica11_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDadosFila {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in); // Inicia o leitor

		Queue<String> filaBanco = new LinkedList<String>(); // Inicialização da Queue

		String nomeCliente;
		int opcao;

		// Menu de opções
		System.out.printf("*********************************************"
				+ "\n*                                           *" 
				+ "\n*       1 - Adicionar Cliente na Fila       *"
				+ "\n*       2 - Listar todos os Clientes        *" 
				+ "\n*       3 - Retirar Cliente da Fila         *"
				+ "\n*       0 - Sair                            *" 
				+ "\n*                                           *"
				+ "\n*********************************************");

		// Laço de repetição, permite que o usuário digite opções até que decida sair do
		// programa
		do {
			// Pede ao usuário que digite uma opção
			System.out.print("\nEntre com a opção desejada: ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println("\n*********************************************");

			switch (opcao) {

			case 1:
				// Add um cliente à lista
				System.out.print("\nDigite o Nome do Cliente: ");
				nomeCliente = leitor.nextLine();
				filaBanco.add(nomeCliente);

				// Imprime a lista com o novo cliente
				System.out.println("\nFila: \n");
				for (String cliente : filaBanco) {
					System.out.println(cliente);
				}

				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				// Lista todos os clientes na fila
				System.out.println("Lista de Clientes na Fila: \n");

				for (String cliente : filaBanco) {
					System.out.println(cliente);
				}
				break;

			case 3:
				// Remove o primeiro cliente da fila, caso vazia, avisa o usuário
				if (filaBanco.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					filaBanco.remove();

					System.out.println("\nFila: \n");
					for (String cliente : filaBanco) {
						System.out.println(cliente);
					}
					System.out.println("\nO Cliente foi chamado!");
				}
				break;

			case 0:
				// Diz ao Usuário que o programa foi finalizado
				System.out.println("Programa Finalizado");
				break;

			default:
				// Caso o usuário digite uma opção inválida
				System.out.println("Opção Inválida! Tente Novamente.");
			}
		} while (opcao != 0); // Finaliza o Programa

		leitor.close();

	}

}
