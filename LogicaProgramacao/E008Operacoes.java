package LogicaProgramacao;

import java.util.Scanner;

public class E008Operacoes {

	public static void main(String[] args) {

		int num1, num2, soma, subtracao, mult, div, resto;
		boolean sucesso;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
		num1 = input.nextInt();
		System.out.println("Informe um n�mero: ");
		num2 = input.nextInt();

//realizando as opera��es
		soma = num1 + num2;
		subtracao = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;
		sucesso = num1 > 1; //usando uma valida��o l�gica

		System.out.println("O resultado da soma dos valores �: " + soma);
		System.out.println("O resultado da subtra��o dos valores �: " + subtracao);
		System.out.println("O resultado da multiplica��o dos valores �: " + mult);
		System.out.println("O resultado da divis�o dos valores �: " + div);
		System.out.println("O resto da divis�o dos valores �: " + resto);
		System.out.println("A vari�vel sucesso, possui valor: " + sucesso); //retornando o valor da valida��o l�gica
		input.close();
		
	}

}
