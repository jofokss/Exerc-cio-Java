import java.util.Scanner;

public class First {

	/*
	 * 1. 1. Fa�a um programa que receba o valor do sal�rio de um funcion�rio e
	 * o percentual de aumento calcule e mostre o valor do aumento e o novo
	 * sal�rio.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu sal�rio: ");
		int sal = sc.nextInt();
		System.out.println("Digite a porcentagem: ");
		double perc = sc.nextDouble();

		double df = (((perc * sal) / 100) + sal);

		System.out.println("total: " + df);

	}

}