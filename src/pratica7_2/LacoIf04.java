package pratica7_2;

import java.util.Scanner;

public class LacoIf04 {

	public static void main(String[] args) {
		/* REFAZER ESTE, COMPARAÇÃO DE STRING FALHA*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite Características de animais: ");
		
		System.out.println("Características 01: ");
		leitor.skip("\\R?");
		String caracteristica01 = leitor.nextLine();
		
		System.out.println("Características 02: ");
		leitor.skip("\\R?");
		String caracteristica02 = leitor.nextLine();
		
		System.out.println("Características 03: ");
		leitor.skip("\\R?");
		String caracteristica03 = leitor.nextLine();
		
		String dietaCar= "carnívoro";
		String dietaOni = "onívoro";
		String dietaHerb = "herbívoro";
		String dietaHem = "hematófago";
		
		
		if (caracteristica01.equals("vertebrado")) {
			if (caracteristica02.equals("ave")) {
				if (caracteristica03.equals(dietaCar)) {
					System.out.println("Águia");
				}
				else if (caracteristica03.equals(dietaHem)) {
					System.out.println("Pomba");
				}
			}
			else if (caracteristica02.equals("mamífero")) {
				if (caracteristica03.equals(dietaOni))
				{
					System.out.println("Homem");
				}
				else if (caracteristica03.equals(dietaHerb)) {
					System.out.println("Vaca");
				}
			}
		}
		else if (caracteristica01.equals("invertebrado")) {
			if (caracteristica02.equals("inseto")) {
				if (caracteristica03.equals(dietaHem)) {
					System.out.println("Pulga");
				}
				else if (caracteristica03.equals(dietaHerb)) {
					System.out.println("Lagarta");
				}
			} 
			else if (caracteristica02.equals("anelídeo")) {
				if (caracteristica03.equals(dietaHem)) {
					System.out.println("Sanguessuga");
				} 
				else if (caracteristica03.equals(dietaOni)) {
					System.out.println("Minhoca");
				}
			}
		}
		else {
			System.out.println("Nenhum animal com essas característica encontrado no diagrama.");
		}
		
		leitor.close();

	}

}
