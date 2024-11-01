package pratica10_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		System.out.println("Digite 5 Cores: \n");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Cor n°%d: ", i + 1);
			String inputCor = leitor.nextLine();
			cores.add(inputCor);
		}
		
		System.out.println("\nListar todas as cores: \n");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("\nOrdenar as cores: \n");
		cores.sort(null);
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		leitor.close();

	}

}
