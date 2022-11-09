package LogicaProgramacao;

import java.util.Random;

public class E020AleatorioSort {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		int numMin = 101;
		int numMax = 0;
		int numero;
		
		do {
			numero = gerador.nextInt(20); 
			System.out.println(numero);
			if (numero < numMin) {
				numMin = numero;
			} else if (numero > numMax){
				numMax = numero;
			}
		}while (numMax <= numMin);
		System.out.println("O menor número sorteado foi: " + numMin);
		System.out.println("O maior número sorteado foi: " + numMax);
	}
}
