package LogicaProgramacao;

import java.util.Scanner;

public class E009EstruturasCondicionais {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double n1, n2, n3, media;
		boolean statusAluno;

		System.out.println("Informe a nota 1: ");
		n1 = input.nextDouble();
		System.out.println("Informe a nota 2: ");
		n2 = input.nextDouble();
		System.out.println("Informe a nota 3: ");
		n3 = input.nextDouble();
		media = (n1 + n2 + n3) / 3;
		statusAluno = media >= 7; // validação lógica

		if (statusAluno) { // se statusAluno for verdadeiro, ou seja, maior que 7, o aluno está aprovado
			System.out.println("Aprovado!");
		} else {
			if (media >= 3 && media < 7) {
				System.out.println("Aluno em recuperação.");
			} else {
				System.out.println("Reprovado!");
			}
		}
		input.close();
	}
}
