package LogicaProgramacao;

import java.util.Scanner;

public class E007NumeroPar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero inteiro: ");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("N�mero par.");
		}else {
			System.out.println("N�mero impar.");
		}
		input.close();
	}

}
