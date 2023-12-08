package exercicios02;

import java.util.Scanner;

public class questao03 {

	public static void main(String[] args) {
		/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, 
		só podem doar se não for a sua primeira doação. :*/
		//Declaração de variaveis
		String nome;
		int idade;
		boolean primeiraDoacao;
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		//Condicional e saída de dados
		if((idade>=18 && idade<=69) && (primeiraDoacao==true || primeiraDoacao==false)) {
			if((idade>=60 && idade<=69) && (primeiraDoacao==true)) {
				System.out.println(nome + " não está apto(a) para doar sangue.");
			} else {
			System.out.println(nome + " está apto(a) para doar sangue.");
			}
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue.");
		}

	}
}
