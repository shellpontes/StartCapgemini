package LogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class E012Imc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double altura, peso, imc;
		System.out.println("Informe sua altura: ");
		altura = input.nextDouble();
		System.out.println("Informe o seu peso: ");
		peso = input.nextDouble();

		// formula > imc = peso / altura²
		// para calcular potencia em JAVA >>> Math.pow(base, potencia);

		imc = peso / (Math.pow(altura, 2));
		System.out.printf("O valor de IMC é: %.2f%n", imc);

		// valores abaixo são hipotéticos, não reais
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
		} else if (imc <= 24.9) {
			System.out.println("Peso ideal.");
		} else {
			System.out.println("Acima do peso.");
		}
		input.close();
	}
}
