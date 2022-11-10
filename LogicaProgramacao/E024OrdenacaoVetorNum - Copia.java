package LogicaProgramacao;

import java.util.Arrays;
import java.util.Scanner;

public class E024OrdenacaoVetorNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int vetorIdade[] = new int[5];

		for (int i = 0; i < 5; i++) {// alocando valores dentro do vetor
			System.out.println("Informe uma idade: ");
			vetorIdade[i] = input.nextInt();
		}
		Arrays.sort(vetorIdade);
		System.out.println("Exibindo de forma ordenada:");

		for (int i = 0; i < 5; i++) {
			System.out.println(" | Idade: " + vetorIdade[i]);
		}
		input.close();
	}
}
