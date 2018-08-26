import java.util.Scanner;

public class Eighth {

	public static void main(String[] args) {

		/*
		 * 8. Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma
		 * taxa de serviços diários de:
		 * 
		 * • R$ 15,00, se o número de dias for menor que 10; • R$ 8,00, se o
		 * número de dias for maior ou igual a 10.
		 * 
		 * Criar um programa em Java que informe o nome, o valor da conta de
		 * cada cliente e ao final o total arrecadado pela pousada. (Comando
		 * while)
		 */

		String nome = null;
		int dias = 0;
		float valorCliente = 0.0f;
		float totalPousada = 0.0f;
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;

		while (true) {

			System.out.println("Informe o nome: ");
			nome = leitor.nextLine();
			System.out.println("Informe o numero de Diárias: ");
			dias = Integer.parseInt(leitor.nextLine());

			valorCliente = dias * 40.0f;

			if (dias < 10) {
				valorCliente += (dias * 15);
			}
			if (dias < 10) {
				valorCliente += (dias * 8);
			}

			System.out.println("Cliente: " + nome);
			System.out.println("Conta: " + valorCliente);

			System.out.println("Continuar 1 - Sim");
			System.out.println("          2 - não");
			opcao = Integer.parseInt(leitor.nextLine());

			totalPousada += valorCliente;

			if (opcao == 2) {
				System.out.println("Total arrecadado" + totalPousada);
				System.exit(0);
			}

		}
	}

}
