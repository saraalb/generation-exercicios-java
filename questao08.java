package exercicios02;

import java.util.Scanner;

public class questao08 {

	public static void main(String[] args) {
		//declaracao de variaveis
		int operacaoBancaria;
		float saldo=1000.00f, saque, deposito, valor=0.0f;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada - tabela
		System.out.println("+--------------------------------+");
		System.out.println("+ CÓDIGO DA OPERAÇÃO |  OPERAÇÃO +");
		System.out.println("+    ------------    |    ----   +");
		System.out.println("+          1         |   Saldo   +");
		System.out.println("+          2         |   Saque   +");
		System.out.println("+          3         |  Depósito +");
		System.out.println("+--------------------------------+");
		
		//dados de entrada
		System.out.println("\nDigite o código da operação desejada:");
		operacaoBancaria = leia.nextInt();
		
		if (operacaoBancaria == 2 || operacaoBancaria == 3) {
			System.out.println("Digite valor: ");
			valor = leia.nextFloat();
		} 
		
		
		switch(operacaoBancaria) {
		case 1:
			System.out.printf("Operação - Saldo\nSaldo: R$%.2f", saldo); 
		break;
		case 2:
			System.out.println("Operação - Saque");
			if (valor>1000.00) {
				System.out.println("Saldo insuficiente!");
			} else {
				System.out.printf("Novo saldo: R$%.2f", (saldo-valor));
			}
		break;
		case 3:
			System.out.printf("Operação - Depósito\n"+"Novo saldo: R$%.2f",(saldo+valor));
			
		break;
		default:
			System.out.println("Operação inválida!");
		}
		

	}

}
