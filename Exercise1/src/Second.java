
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		/*
		 * 2. Fa�a um programa que leia 10 n�meros inteiros e exiba na tela a
		 * mensagem �Par� se ele for um n�mero par, ou ��mpar� se ele for um
		 * n�mero �mpar. (Comando if).
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero: ");
			int so = sc.nextInt();

			if (so % 2 == 0) {
				System.out.println("Par!");
			} else {
				System.out.println("Impar!");
			}

		}

	}

}