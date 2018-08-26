import java.util.Scanner;

public class First {

	/*
	 * 1. 1. Faça um programa que receba o valor do salário de um funcionário e
	 * o percentual de aumento calcule e mostre o valor do aumento e o novo
	 * salário.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salário: ");
		int sal = sc.nextInt();
		System.out.println("Digite a porcentagem: ");
		double perc = sc.nextDouble();

		double df = (((perc * sal) / 100) + sal);

		System.out.println("total: " + df);

	}

}