package LogicaProgramacao;

import java.util.Locale;

public class E013EstruturaRepEnquanto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double alturaMarcelo = 1.2;
		double alturaJoao = 1.05;
		double crescMarcelo = 0.05;
		double crescJoao = 0.07;
		int idade = 8;

		while (alturaMarcelo >= alturaJoao) {
			alturaMarcelo += crescMarcelo;
			alturaJoao += crescJoao;
			idade++;
		}
		System.out.println("Idade: " + idade);
		System.out.printf("Altura de João: %.2f%n", alturaJoao);
		System.out.printf("Altura de Marcelo: %.2f%n", alturaMarcelo);
	}
}
