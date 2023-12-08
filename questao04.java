package exercicios02;

import java.util.Scanner;

public class questao04 {

	public static void main(String[] args) {
		//declaracao de variaveis
		String palavra1, palavra2, palavra3;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada
		System.out.println("Digite sua primeira palavra:");
		palavra1 = leia.nextLine();
		System.out.println("Digite sua segunda palavra:");
		palavra2 = leia.nextLine();
		System.out.println("Digite sua terceira palavra:");
		palavra3 = leia.nextLine();
		
		//processamento e saida de dados
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")) {
					System.out.println("águia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if(palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} if(palavra2.equalsIgnoreCase("hematófago")) {
				System.out.println("sanguessuga");
			} else {
				System.out.println("minhoca");
			}
		}

	}

}
