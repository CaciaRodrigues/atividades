package pratica9_7;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
		
		int listaNum[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numDesejo = leitor.nextInt();
		
		boolean achado = false;
		int index = 0;
		
		for (int i = 0; i < listaNum.length; i++) {
			if (listaNum[i] == numDesejo) {
				achado = true;
				index = i;
				break;
			}
		}
		
		if(!achado) {
			System.out.printf("O número %d não foi encontrado!", numDesejo);
		}
		else {
			System.out.printf("O número %d está localizado na posição: %d", numDesejo, index);
			
		}
		
		leitor.close();

	}

}
