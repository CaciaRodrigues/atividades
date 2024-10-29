package pratica7_2;

import java.util.Scanner;

public class LacoSwitch01 {

	public static void main(String[] args) {
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-  MENU  -+-+-+-+-+-+-+-+-+-"
						 + "\n| Código do Produto | Produto         | Valor  |"
						 + "\n________________________________________________"
						 + "\n| 1                 | Cachorro Quente | R$10,00|"
						 + "\n| 2                 | X-Salada        | R$15,00|"
						 + "\n| 3                 | X-Bacon         | R$18,00|"
						 + "\n| 4                 | Bauru           | R$12,00|"
						 + "\n| 5                 | Refrigerante    | R$8,00 |"
						 + "\n| 6                 | Suco de Laranja | R$13,00|"
						 + "\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Código do Produto: ");
		int codigoProduto = leitor.nextInt();
		
		System.out.println("Quantidade: ");
		int quantidade = leitor.nextInt();
		
		switch(codigoProduto) {
		case 1:
			System.out.printf("Produto: Cachorro Quente \n Valor total: R$ %.2f", quantidade * 10.00);
			break;
		case 2:
			System.out.printf("Produto: X-Salada \nValor total: R$ %.2f", quantidade * 15.00);
			break;
		case 3:
			System.out.printf("Produto: X-Bacon \nValor total: R$ %.2f", quantidade * 18.00);
			break;
		case 4:
			System.out.printf("Produto: Bauru \nValor total: R$ %.2f", quantidade * 12.00);
			break;
		case 5:
			System.out.printf("Produto: Refrigerante \nValor total: R$ %.2f", quantidade * 8.00);
			break;
		case 6:
			System.out.printf("Produto: Suco de Laranja \nValor total: R$ %.2f", quantidade * 13.00);
			break;
		default:
			System.out.println("Produto inexistente. Por favor escolha um produto presente no menu!");
		}

		leitor.close();
	}

}
