package exercicios02;

import java.util.Scanner;

public class questao01 {

	public static void main(String[] args) {	
		//Declaraçao de variaveis
		int a, b, c, soma;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Insira o valor de A: ");
		a = leia.nextInt();
		System.out.println("Insira o valor de B: ");
		b = leia.nextInt();
		System.out.println("Insira o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		//Condicional e saída de dados
		if(soma > c) {
			System.out.println("A Soma de A + B é maior do que C.");
		} else if (soma < c) {
			System.out.println("A Soma de A + B é menor do que C.");
		} else if (soma == c) {
			System.out.println("A Soma de A + B é igual a C.");
		} else {
			System.out.println("Insira valor válido.");
		}
		


	}

}
