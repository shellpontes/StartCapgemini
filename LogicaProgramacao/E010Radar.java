package LogicaProgramacao;

import java.util.Scanner;

public class E010Radar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double velocidadeVeiculo;
		System.out.println("Informe a velocidade do ve�culo.");
		velocidadeVeiculo = input.nextDouble();

		if (velocidadeVeiculo <= 50) {
			System.out.println("Dentro do limite permitido, n�o haver� infra��o.");
		} else if (velocidadeVeiculo > 50 && velocidadeVeiculo <= 70) {
			System.out.println("Acima do permitido, infra��o leve, 3 pontos na carteira.");
		} else if (velocidadeVeiculo > 70 && velocidadeVeiculo <= 90){
			System.out.println("Acima do permitido, infra��o grave, 4 pontos na carteira.");
		} else {
			System.out.println("Acima do permitido, infra��o graviss�ma, 5 pontos na carteira.");
		}
		input.close();
	}
}