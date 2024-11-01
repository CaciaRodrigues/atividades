package pratica10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int numDesejo = leitor.nextInt();
		
		if (numeros.contains(numDesejo)) {
			System.out.printf("O número %d está localizado na posição: %d", numDesejo, numeros.indexOf(numDesejo));			
		}
		else {
			System.out.printf("O número %d não foi encontrado!", numDesejo);
		}
		
		leitor.close();
	}

}
