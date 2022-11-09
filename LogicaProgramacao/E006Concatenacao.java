package LogicaProgramacao;

import java.util.Scanner;

public class E006Concatenacao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String nome;
		String sobrenome;
		String nomeCompleto;

		System.out.println("Informe seu nome sobrenome, respectivamente: ");
		nome = input.nextLine();
		sobrenome = input.nextLine();
		nomeCompleto = nome + sobrenome; // Aqui ocorre a concatenação
		System.out.println(nomeCompleto);
		input.close();
	}

}
