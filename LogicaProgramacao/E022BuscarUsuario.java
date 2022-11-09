package LogicaProgramacao;

import java.util.Scanner;

public class E022BuscarUsuario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String user[] = new String[5];
		String nome;
		boolean validation = true;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um nome: ");
			user[i] = input.nextLine().toLowerCase();//Padronizando tudo em minúscula
		}
		System.out.println("Informe o nome que deseja localizar: ");
		nome = input.nextLine().toLowerCase();

		for (int i = 0; i < 5; i++) {
			if (validation) {
				if (nome.equals(user[i])) {
					System.out.println("O nome " + nome + " foi encontra na posição " + i + " do vetor user.");
					validation = false;
				}
			}
		}
		if (validation) {
			System.out.println("O nome informado não foi encontrado.");
		}
		input.close();
	}
}
