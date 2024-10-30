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
		
		String carnivoro = "carnívoro";
		String onivoro = "onívoro";
		String herbivoro = "herbívoro";
		String hematofago = "hematófago";
		
		
		if (caracteristica01 == "vertebrado") {
			if (caracteristica02 == "ave") {
				if (caracteristica03 == carnivoro) {
					System.out.println("Águia");
				}
				else if (caracteristica03 == onivoro) {
					System.out.println("Pomba");
				}
			}
			else if (caracteristica02 == "mamífero") {
				if (caracteristica03 == onivoro)
				{
					System.out.println("Homem");
				}
				else if (caracteristica03 == herbivoro) {
					System.out.println("Vaca");
				}
			}
		}
		else if (caracteristica01 == "invertebrado") {
			if (caracteristica02 == "inseto") {
				if (caracteristica03 == hematofago) {
					System.out.println("Pulga");
				}
				else if (caracteristica03 == herbivoro) {
					System.out.println("Lagarta");
				}
			} 
			else if (caracteristica02 == "anelídeo") {
				if (caracteristica03 == hematofago) {
					System.out.println("Sanguessuga");
				} 
				else if (caracteristica03 == onivoro) {
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
