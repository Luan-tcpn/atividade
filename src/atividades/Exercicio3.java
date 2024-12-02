package atividades;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {


		//Variavies
		float salario_bruto;
		float adicional_noturno;
		float horas_extras;
		float descontos;
		float salario_liquido;
		
		//Scanner 
		Scanner leia = new Scanner(System.in);
		
		//Interação
		
		System.out.println("Digite o salario bruto: ");
		salario_bruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		adicional_noturno = leia.nextFloat();
		
		System.out.println("Digite a quantidade de horas extras : ");
	    horas_extras = leia.nextFloat();
		
	    System.out.println("Digite o valor a ser descontado: ");
		descontos = leia.nextFloat();
		
		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;
		
	
		System.out.printf("O salário líquido é: %.2f" , salario_liquido);

	}

}
