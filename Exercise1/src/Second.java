
import java.util.Scanner;

public class Second {

	public static void main(String[] args) {

		/*
		 * 2. Faça um programa que leia 10 números inteiros e exiba na tela a
		 * mensagem ‘Par’ se ele for um número par, ou ‘Ímpar’ se ele for um
		 * número ímpar. (Comando if).
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