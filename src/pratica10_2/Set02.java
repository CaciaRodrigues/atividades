package pratica10_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		
		System.out.println("Digite o número que deseja encontrar: ");
		int numDesejo = leitor.nextInt();
		
		if(numeros.contains(numDesejo)) {
			System.out.printf("O número %d foi encontrado!", numDesejo);
		}
		else {
			System.out.printf("O número %d não foi encontrado!", numDesejo);
		}
		
		leitor.close();

	}

}
