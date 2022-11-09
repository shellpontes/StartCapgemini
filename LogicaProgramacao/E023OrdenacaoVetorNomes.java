package LogicaProgramacao;

import java.util.Arrays;
import java.util.Scanner;

public class E023OrdenacaoVetorNomes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String vetorNomes[] = new String[5];

		for (int i = 0; i < 5; i++) {// alocando valores dentro do vetor
			System.out.println("Informe um nome: ");
			vetorNomes[i] = input.nextLine().toUpperCase();// padronizando e recebendo todos os nomes em maiuscula;
		}

		System.out.println("Imprimindo nomes desordenados: ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome: " + vetorNomes[i]);
		}

		System.out.println("Imprimindo nomes ordenados: ");
		Arrays.sort(vetorNomes);
		for (String nome : vetorNomes)
			System.out.println(nome);
		System.out.println();
		input.close();
	}

}
