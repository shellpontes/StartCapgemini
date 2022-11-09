package LogicaProgramacao;

import java.util.Scanner;

public class E008Operacoes {

	public static void main(String[] args) {

		int num1, num2, soma, subtracao, mult, div, resto;
		boolean sucesso;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um número: ");
		num1 = input.nextInt();
		System.out.println("Informe um número: ");
		num2 = input.nextInt();

//realizando as operações
		soma = num1 + num2;
		subtracao = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;
		sucesso = num1 > 1; //usando uma validação lógica

		System.out.println("O resultado da soma dos valores é: " + soma);
		System.out.println("O resultado da subtração dos valores é: " + subtracao);
		System.out.println("O resultado da multiplicação dos valores é: " + mult);
		System.out.println("O resultado da divisão dos valores é: " + div);
		System.out.println("O resto da divisão dos valores é: " + resto);
		System.out.println("A variável sucesso, possui valor: " + sucesso); //retornando o valor da validação lógica
		input.close();
		
	}

}
