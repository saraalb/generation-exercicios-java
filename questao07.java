package exercicios02;

import java.util.Scanner;

public class questao07 {
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";
//Calculadora
	public static void main(String[] args) {
		int numero1, numero2, codigoOperacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(MAGENTA+"+--------------------------------+"+RESET);
		System.out.println(MAGENTA+"+     Código     |    Operação   +"+RESET);
		System.out.println(MAGENTA+"+    ---------   |    --------   +"+RESET);
		System.out.println(MAGENTA+"+        1       |      Soma     +"+RESET);
		System.out.println(MAGENTA+"+        2       |    Subtração  +"+RESET);
		System.out.println(MAGENTA+"+        3       | Multiplicação +"+RESET);
		System.out.println(MAGENTA+"+        4       |     Divisão   +"+RESET);
		System.out.println(MAGENTA+"+--------------------------------+"+RESET);
		
		System.out.println("Digito o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o código da operação desejada:");
		codigoOperacao = leia.nextInt();
		
		switch(codigoOperacao) {
		case 1:
			System.out.println(numero1 +" + "+numero2+" = "+(numero1+numero2));
		break;
		case 2: 
			System.out.println(numero1 +" - "+numero2+" = "+(numero1-numero2));
		break;
		case 3:
			System.out.println(numero1 +" * "+numero2+" = "+(numero1*numero2));
		break;
		case 4: 			System.out.println(numero1 +" / "+numero2+" = "+(numero1/numero2));
		break;
		default:
			System.out.println("Operação inválida!");
		}

	}

}
