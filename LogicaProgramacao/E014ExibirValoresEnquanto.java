//imprimir valores até 100.
package LogicaProgramacao;

public class E014ExibirValoresEnquanto {

	public static void main(String[] args) {
		int i = 0;

		while (i <= 100) {
			System.out.println(i);
			i++;
			// se aqui fosse incluso o 'break', ele seria interrompido e parava;
		}
	}
}
