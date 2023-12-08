package exercicios02;

import java.util.Scanner;

public class questao05 {
	public static final String RESET = "\u001B[0m";
	public static final String GREEN = "\u001B[32m";

	public static void main(String[] args) {
		//declaracao de variaveis
		Scanner leia = new Scanner(System.in);
		int produto, quantidade;
		
		//dados de entrada - tabela
        System.out.println(GREEN+"+---------------------+-----------------------+-------------------+"+RESET);
        System.out.println(GREEN+"| Código do Produto   | Produto               | Preço Unitário    |"+RESET);
        System.out.println(GREEN+"+---------------------+-----------------------+-------------------+"+RESET);
        System.out.println(GREEN+"| 1                   | Cachorro Quente       | R$ 10.00          |"+RESET);
        System.out.println(GREEN+"| 2                   | X-Salada              | R$ 15.00          |"+RESET);
        System.out.println(GREEN+"| 3                   | X-Bacon               | R$ 18.00          |"+RESET);
        System.out.println(GREEN+"| 4                   | Bauru                 | R$ 12.00          |"+RESET);
        System.out.println(GREEN+"| 5                   | Refrigerante          | R$ 8.00           |"+RESET);
        System.out.println(GREEN+"| 6                   | Suco de laranja       | R$ 13.00          |"+RESET);
        System.out.println(GREEN+"+---------------------+-----------------------+-------------------+"+RESET);
		
		//dados de entrada
		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		//processamento e saida de dados
		switch(produto) {
		case 1:
			System.out.println("Produto Cachorro Quente");
			System.out.println("Valor total da compra: " + (quantidade*10.00));
		break;
		case 2:
			System.out.println("Produto x-salada");
			System.out.println("Valor total da compra: " + (quantidade*15.00));
		break;
		case 3:
			System.out.println("Produto x-bacon");
			System.out.println("Valor total da compra: " + (quantidade*18.00));
		break;
		case 4:
			System.out.println("Produto bauru");
			System.out.println("Valor total da compra: " + (quantidade*12.00));
		break;
		case 5:
			System.out.println("Produto refrigerante");
			System.out.println("Valor total da compra: " + (quantidade*8.00));
		break;
		case 6:
			System.out.println("Produto suco de laranja");
			System.out.println("Valor total da compra: " + (quantidade*13.00));
		break;
		default:
			System.out.println("opção inválida");
		}


	}

}
