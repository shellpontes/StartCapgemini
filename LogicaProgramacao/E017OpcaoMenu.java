package LogicaProgramacao;

import java.util.Scanner;

public class E017OpcaoMenu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int opcao;
		
		do {
		System.out.println("----------- MENU DE OP��ES ----------------");
		System.out.println("|           1 - TROCA DE �LEO             |");
		System.out.println("|           2 - BALANCEMANETO             |");
		System.out.println("|           3 - SAIR                      |");
		System.out.println("-------------------------------------------");
		System.out.println("Informe uma das op��es acima, para consultar os valores: ");
		opcao = input.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("O valor da troca de �leo � R$ 100,00");
				break;
			case 2:
				System.out.println("O valor do balanceamento � de R$ 89,90.");
				break;
			case 3:
				System.out.println("Opera��o finalizada!");
				break;
			default:
			System.out.println("Op��o inv�lida!");
			}
		}while(opcao != 3);

		input.close();
	}

}
