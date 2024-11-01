package pratica10_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		System.out.println("Digite 10 números inteiros: \n");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d° número: ", i + 1);
			Integer inputNum = leitor.nextInt();
			numeros.add(inputNum);
		}
		
		System.out.println("\nListar dados do Set: \n");
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		leitor.close();

	}

}
