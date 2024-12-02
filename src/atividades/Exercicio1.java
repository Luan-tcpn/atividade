package atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		//variavies
		float salario;
		float abono;
		float salariofinal;
		
		//Scanner 
		Scanner leia = new Scanner(System.in);
		
	
		//Interação
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		salariofinal = salario + abono;
		
		System.out.println("Seu novo salário é: " + salariofinal);
		
		
	}

}
