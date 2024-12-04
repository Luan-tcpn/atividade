package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int i;
		Scanner leia = new Scanner(System.in);

		/*System.out.println("\nDigite o 2º nome: ");
		nome2 = leia.nextLine();
		System.out.println("O 2º nome é: " + nome2);

		System.out.println("\nDigite o 3º nome: ");
		nome3 = leia.nextLine();
		System.out.println("O 3º nome é: " + nome3); */

		for (i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "º nome: ");
			nome = leia.nextLine();
			System.out.println("O " + i + "º nome é: " + nome);

		}
	}

}
