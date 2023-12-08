package exercicios02;

import java.util.Scanner;

public class questao06 {
    public static final String RESET = "\u001B[0m";
	public static final String CYAN = "\u001B[36m";


    public static void main(String[] args) {
    	//declaraçao de variaveis
		String nomeColaborador;
		int codCargo;
		float salario, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada
		System.out.println("Digite seu nome:");
		nomeColaborador = leia.nextLine();

		//dados de entrada / tabela da profissao
		System.out.println(CYAN+"+--------------------------------------------------------+"+RESET);
		System.out.println(CYAN+"+"+RESET+" Código do Cargo "+CYAN+"|"+RESET+"    Cargo    "+CYAN+"|"+RESET+" Percentual do Reajuste "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+   ----------    |    -----    |   -------------------  +"+RESET);
		System.out.println(CYAN+"+"+RESET+"        1        "+CYAN+"|"+RESET+"   Gerente   "+CYAN+"|"+RESET+"           10%          "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+"+RESET+"        2        "+CYAN+"|"+RESET+"  Vendedor   "+CYAN+"|"+RESET+"           7%           "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+"+RESET+"        3        "+CYAN+"|"+RESET+"  Supervisor "+CYAN+"|"+RESET+"           9%           "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+"+RESET+"        4        "+CYAN+"|"+RESET+"  Motorista  "+CYAN+"|"+RESET+"           6%           "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+"+RESET+"        5        "+CYAN+"|"+RESET+" Estoquista  "+CYAN+"|"+RESET+"           5%           "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+"+RESET+"        6        "+CYAN+"|"+RESET+"Técnico de TI"+CYAN+"|"+RESET+"           8%           "+CYAN+"+"+RESET);
		System.out.println(CYAN+"+--------------------------------------------------------+"+RESET);

		//dados de entrada
		System.out.println("Digite o código do cargo:");
		codCargo = leia.nextInt();
		
		System.out.println("Informe salário:");
		salario = leia.nextFloat();
		
		//processamento e saída
		
		System.out.println("\n\n"+CYAN+"+--------------------------------------------------------+"+RESET);
		
		System.out.println("Nome do colaborador: " + nomeColaborador);
		
		switch(codCargo) {
		case 1:
			System.out.println("Cargo: Gerente");
			novoSalario = salario + (0.10f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		case 2:
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + (0.07f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		case 3:
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + (0.09f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		case 4:
			System.out.println("Cargo: Motorista");
			novoSalario = salario + (0.06f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		case 5:
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + (0.05f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		case 6:
			System.out.println("Cargo: Técnico de TI");
			novoSalario = salario + (0.08f*salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
		break;
		default:
			System.out.println("Cargo: digite uma opção válida.");
		}
		
		System.out.println("\n\n"+CYAN+"+--------------------------------------------------------+"+RESET);
	}

}
