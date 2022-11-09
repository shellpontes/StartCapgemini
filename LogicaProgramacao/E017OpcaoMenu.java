package LogicaProgramacao;

import java.util.Scanner;

public class E017OpcaoMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao;
		
		do {
		System.out.println("----------- MENU DE OPÇÕES ----------------");
		System.out.println("|           1 - TROCA DE ÓLEO             |");
		System.out.println("|           2 - BALANCEMANETO             |");
		System.out.println("|           3 - SAIR                      |");
		System.out.println("-------------------------------------------");
		System.out.println("Informe uma das opções acima, para consultar os valores: ");
		opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("O valor da troca de óleo é R$ 100,00");
				break;
			case 2:
				System.out.println("O valor do balanceamento é de R$ 89,90.");
				break;
			case 3:
				System.out.println("Operação finalizada!");
				break;
			default:
			System.out.println("Opção inválida!");
			}
		}while(opcao != 3);

		input.close();
	}

}
