import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {

		/*
		 * 4. Uma empresa decidiu dar 20% de aumento aos funcion�rios cujos
		 * sal�rios s�o inferiores a 500 reais. Escreva um programa que leia o
		 * sal�rio de v�rios funcion�rios se mostre o valor do sal�rio
		 * reajustado ou uma mensagem caso o funcion�rio n�o tenha direito ao
		 * aumento. O programa ser� encerrado quando se digitar �fim� para o
		 * nome do funcion�rio. (Comando while)
		 */
		
		Scanner sc = new Scanner(System.in);
		int or = 0;

		while (or == 0) {

			System.out.println("Digite seu nome: ");
			String name = sc.nextLine();
			if (name.equals("fim")) {
				or = 1;
			} else {
				System.out.println("Digite seu sal�rio: ");
				int sal = sc.nextInt();
				sc.nextLine();

				if (sal <= 500) {
					int df = (((20 * sal) / 100) + sal);

					System.out.println("sal�rio reajustado: " + df);

				} else {
					System.out.println("Voc� n�o tem direito ao aumento!");
				}

			}

		}

	}

}