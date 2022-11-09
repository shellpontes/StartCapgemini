package LogicaProgramacao;

import java.util.Scanner;

public class E010Radar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double velocidadeVeiculo;
		System.out.println("Informe a velocidade do veículo.");
		velocidadeVeiculo = input.nextDouble();

		if (velocidadeVeiculo <= 50) {
			System.out.println("Dentro do limite permitido, não haverá infração.");
		} else if (velocidadeVeiculo > 50 && velocidadeVeiculo <= 70) {
			System.out.println("Acima do permitido, infração leve, 3 pontos na carteira.");
		} else if (velocidadeVeiculo > 70 && velocidadeVeiculo <= 90){
			System.out.println("Acima do permitido, infração grave, 4 pontos na carteira.");
		} else {
			System.out.println("Acima do permitido, infração gravissíma, 5 pontos na carteira.");
		}
		input.close();
	}
}