package pratica7_2;

import java.util.Scanner;

public class LacoIf03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Doador: ");
		leitor.skip("\\R?");
		String nomeDoador = leitor.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		int idadeDoador = leitor.nextInt();
		
		System.out.println("Primeira doação de Sangue(true/false)? ");
		boolean primeiraDoacao = leitor.nextBoolean();
		
		if (idadeDoador >= 18 && idadeDoador <= 69) {
			if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
				System.out.printf("%s não está apto(a) para doar sangue!", nomeDoador);
			}
			else {
				System.out.printf("%s está apto(a) para doar sangue!", nomeDoador);
			}
		}
		else {
			System.out.printf("%s não está apto(a) para doar sangue!", nomeDoador);
		}
		
		leitor.close();

	}

}
