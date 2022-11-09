package LogicaProgramacao;

import java.util.Scanner;

public class E021Vetores {

	public static void main(String[] args) {

		Scanner inputNomes = new Scanner(System.in);
		Scanner inputIdade = new Scanner(System.in);
		String vetorNomes[] = new String [5];
		int vetorIdade[] = new int[5];
		
		for (int i = 0; i < 5; i++) {//alocando valores dentro do vetor
			System.out.println("Informe um nome: ");
			vetorNomes[i] = inputNomes.nextLine().toUpperCase();//padronizando e recebendo todos os nomes em maiuscula;
			System.out.println("Informe uma idade: ");
			vetorIdade[i] = inputIdade.nextInt();
		}
				
		for (int i = 0; i < 5; i++) {
			System.out.println("Nome: " + vetorNomes[i] + " | Idade: " + vetorIdade[i]);
		}
		inputNomes.close();
		inputIdade.close();
	}
}
