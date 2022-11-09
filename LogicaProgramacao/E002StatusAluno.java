package LogicaProgramacao;

import java.util.Scanner;

public class E002StatusAluno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double soma = 0;
		int i = 0;

		while (i < 3) {
			System.out.println("Informe a nota do aluno: ");
			double n = input.nextDouble();
			if (n >= 0) {
				soma += n;
				i++;
			} else {
				System.out.println("Valor inválido, tente novamente.");
			}
		}
		double media = soma/3;
		System.out.println("A média do aluno foi: " + media);
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		input.close();
	}
}
