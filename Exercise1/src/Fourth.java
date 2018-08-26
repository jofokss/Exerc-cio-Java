import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {

		/*
		 * 4. Uma empresa decidiu dar 20% de aumento aos funcionários cujos
		 * salários são inferiores a 500 reais. Escreva um programa que leia o
		 * salário de vários funcionários se mostre o valor do salário
		 * reajustado ou uma mensagem caso o funcionário não tenha direito ao
		 * aumento. O programa será encerrado quando se digitar “fim” para o
		 * nome do funcionário. (Comando while)
		 */
		
		Scanner sc = new Scanner(System.in);
		int or = 0;

		while (or == 0) {

			System.out.println("Digite seu nome: ");
			String name = sc.nextLine();
			if (name.equals("fim")) {
				or = 1;
			} else {
				System.out.println("Digite seu salário: ");
				int sal = sc.nextInt();
				sc.nextLine();

				if (sal <= 500) {
					int df = (((20 * sal) / 100) + sal);

					System.out.println("salário reajustado: " + df);

				} else {
					System.out.println("Você não tem direito ao aumento!");
				}

			}

		}

	}

}