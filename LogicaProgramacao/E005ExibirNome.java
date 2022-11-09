package LogicaProgramacao;

import java.util.Scanner;

public class E005ExibirNome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String nome;
		System.out.println("Digite o seu nome completo: ");
		nome = input.nextLine();
		System.out.println("O nome informado foi " + nome + ".");
		input.close();
	}

}
