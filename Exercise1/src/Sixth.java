import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {

		/*
		 * 6. A prefeitura de Jo�o Pessoa abriu uma linha de cr�dito para os
		 * funcion�rios municipais. O valor m�ximo da presta��o n�o poder�
		 * ultrapassar 30% do sal�rio bruto. Fazer um algoritmo que permita
		 * entrar com o sal�rio bruto e o valor da presta��o e informar se o
		 * empr�stimo pode ou n�o ser concedido. (comando if)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		int ru;
		System.out.println("Digite o seu sal�rio: ");
		int ra = sc.nextInt();

		ru = (ra * 30 / 100);

		System.out.println("Digite o valor da presta��o: ");
		int rr = sc.nextInt();

		if (rr <= ru) {

			System.out.println("O emprestimo foi concedido! ");

		} else {
			System.out.println("O emprestimo n�o foi concedido! ");
		}

	}

}
