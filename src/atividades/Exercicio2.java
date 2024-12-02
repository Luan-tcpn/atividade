package atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		//variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float media;
		
		//Scanner 
		Scanner leia = new Scanner(System.in);
		
		//Interação
		System.out.println("Digite a Nota 1: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite a Nota 2: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite a Nota 3: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite a Nota 4: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4 )/4;
		
		System.out.printf("\n Sua media final é: %.1f" ,media);
		
		
		
	}

}
