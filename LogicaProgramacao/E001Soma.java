package LogicaProgramacao;

import java.util.Scanner;

public class E001Soma {

	public static void main(String[] args) {

		System.out.println("Informe respectivamente dois números.");
		Scanner input = new Scanner (System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double soma = num1 + num2;
		
		System.out.println("A soma dos números é igual a: " + soma);
		input.close();
	}

}
