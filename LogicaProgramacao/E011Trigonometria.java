package LogicaProgramacao;

import java.util.Scanner;

public class E011Trigonometria {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double lado1, lado2, lado3;
		System.out.println("Informe o valor do lado 1: ");
		lado1 = input.nextDouble();
		System.out.println("Informe o valor do lado 2: ");
		lado2 = input.nextDouble();
		System.out.println("Informe o valor do lado 3: ");
		lado3 = input.nextDouble();

		if ((lado1 > (lado2 + lado3)) || (lado2 > (lado1 + lado3) || (lado3 > (lado1 + lado2)))) {
			System.out.println("Os lados informados, não formam um triângulo.");
		} else {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Os lados forma um triângulo equilátero.");
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("Os lados forma um triângulo escalêno.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Os lados forma um triângulo isóceles.");
			}
		}
		input.close();
	}
}
