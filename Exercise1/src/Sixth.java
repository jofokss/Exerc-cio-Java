import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {

		/*
		 * 6. A prefeitura de João Pessoa abriu uma linha de crédito para os
		 * funcionários municipais. O valor máximo da prestação não poderá
		 * ultrapassar 30% do salário bruto. Fazer um algoritmo que permita
		 * entrar com o salário bruto e o valor da prestação e informar se o
		 * empréstimo pode ou não ser concedido. (comando if)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		int ru;
		System.out.println("Digite o seu salário: ");
		int ra = sc.nextInt();

		ru = (ra * 30 / 100);

		System.out.println("Digite o valor da prestação: ");
		int rr = sc.nextInt();

		if (rr <= ru) {

			System.out.println("O emprestimo foi concedido! ");

		} else {
			System.out.println("O emprestimo não foi concedido! ");
		}

	}

}
