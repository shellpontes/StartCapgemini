package LogicaProgramacao;

import java.util.Scanner;

public class E015IBGEIdades {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int qtdEntrevistados = 0;
		int idadeMedia = 0;
		int idadeInformada;
		int maisNovo = 1000;
		int maisVelho = 0;
		double qtdMenoresIdades = 0;
		double porcentagemIdadeMenor, porcentagemIdadeMaior;

		while (qtdEntrevistados < 5) {
			System.out.println("Informe uma idade: ");
			idadeInformada = input.nextInt();
			idadeMedia += idadeInformada;
			if (idadeInformada < 18) {
				qtdMenoresIdades++;
				if (idadeInformada < maisNovo) {
					maisNovo = idadeInformada;
				}
			} else {
				if (idadeInformada > maisVelho) {
					maisVelho = idadeInformada;
				}
			}
			qtdEntrevistados++;
		}
		idadeMedia = idadeMedia / 5;
		porcentagemIdadeMenor = (qtdMenoresIdades / 5 * 100);
		porcentagemIdadeMaior = ((5 - qtdMenoresIdades) / 5 * 100);

		System.out.println("O mais novo possui idade de " + maisNovo + " anos.");
		System.out.println("O mais velho possui idade de " + maisVelho + " anos.");
		System.out.println("A média das idades é " + idadeMedia + " anos.");
		System.out.println("A porcentagem de pessoas menores de idade: " + porcentagemIdadeMenor + "%");
		System.out.println("A porcentagem de pessoas maiores de idade: " + porcentagemIdadeMaior + "%");

		input.close();
	}
}
