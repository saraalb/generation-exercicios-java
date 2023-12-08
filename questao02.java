package exercicios02;

import java.util.Scanner;

public class questao02 {
	public static void main(String[] args) {	
	//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela 
	//uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo. 

	//Declaraçao de variaveis
	int num;
	Scanner leia = new Scanner(System.in);

	
	//Entrada de dados
	System.out.println("Digite um número: ");
	num = leia.nextInt();
	
	//Condicional e saída de dados
	if(num>=0) {
		if(num%2==0) {
			System.out.println("O número "+num+" é par e positivo.");
		} else {
			System.out.println("O número "+num+" é ímpar e positivo.");
		} 
	} else if (num<0 && num%2==0){
		System.out.println("O número "+num+" é par e negativo.");
		} else {
			System.out.println("O número "+num+" é ímpar e negativo.");
		}
}
}
