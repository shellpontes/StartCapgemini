package LogicaProgramacao;

import java.util.Scanner;

public class E016Senha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int senha = 101218;
		int resposta;

		do {
			System.out.println("Digite sua senha: ");
			resposta = input.nextInt();
		} while (resposta != senha);

		System.out.println("Senha inserida com sucesso!");
		input.close();
	}
}