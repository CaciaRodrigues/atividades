package pratica11_3;

import java.util.Scanner;
import java.util.Stack;

public class EstruturaDadosPilha {

	public static void main(String[] args) {
		// Cirar um Stack tipo string
		// ter menu com opcoes (switch)
		// opcoes 0, 1, 2, 3
		Scanner leitor = new Scanner(System.in);

		Stack<String> pilhaLivros = new Stack<String>();

		int opcao;
		String nomeLivro;

		// Menu de opções
		System.out.printf("*********************************************"
				+ "\n*                                           *" 
				+ "\n*       1 - Adicionar Livro na pilha        *"
				+ "\n*       2 - Listar todos os Livros          *" 
				+ "\n*       3 - Retirar Livro da pilha          *"
				+ "\n*       0 - Sair                            *" 
				+ "\n*                                           *"
				+ "\n*********************************************");

		do {
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leitor.nextInt();
			leitor.nextLine();
			System.out.println("\n*********************************************");

			switch (opcao) {

			case 1:
				// Adicionar Livros a pilha
				System.out.println("\nDigite o nome do Livro: ");
				nomeLivro = leitor.nextLine();
				pilhaLivros.add(nomeLivro);

				// Lista a pilha com o novo livro adicionado
				System.out.println("\nPilha: \n");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				// Lista os livros da pilha
				System.out.println("\nLista de Livros na Pilha: \n");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;

			case 3:
				// Remove o livro do topo da pilha, caso vazia, avisa o usuário
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					pilhaLivros.pop();

					System.out.println("\nFila: \n");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;
			case 0:
				// Avisa o usuário que o programa foi finalizado
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				// Caso o usuário digite uma opção inválida
				System.out.println("Opção Inválida! Tente Novamente.");
			}
		} while (opcao != 0);

		leitor.close();

	}

}
