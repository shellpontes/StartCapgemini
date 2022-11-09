package LogicaProgramacao;

import java.util.Scanner;

public class E003ConsumoCarro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Informe a distancia percorrida: ");
		double distancia = input.nextDouble();
		System.out.println("Informe o total de combústivel gasto: ");
		double totalCombustivel = input.nextDouble();
		
		double consumo = distancia / totalCombustivel;
		
		System.out.println("O consumo médio de combustível é de " + consumo + " km/l.");
		input.close();
	}

}
