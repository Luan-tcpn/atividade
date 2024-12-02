package atividades;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//variaveis
		float n1;
		float n2;
		float n3;
		float n4;
		float calculo;
		
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
			
	calculo = (n1 *n2) - (n3 * n4);
	
	System.out.println("O cálculo da diferença é: " + calculo);
	
	}

}
