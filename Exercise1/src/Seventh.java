import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {

		/*
		 * 7. Faça um programa que receba duas notas de seis alunos, calcule e
		 * mostre (comando for):
		 * 
		 * • A média aritmética das duas notas de cada aluno; 
		 * • A mensagem que está na tabela.
		 */

		Scanner sc = new Scanner(System.in);

		int rep = 0;
		int exa = 0;
		int apr = 0;

		for (int i = 0; i < 6; i++) {

			System.out.println("Digite a 1º nota: ");
			int ho = sc.nextInt();
			System.out.println("Digite a 2º nota: ");
			int hi = sc.nextInt();

			int media = ((ho + hi) / 2);

			System.out.println("Média: " + media);
			if (media < 3) {
				System.out.println("Reprovado!\n\n");
				rep += 1;
			} else if (media >= 3 && media <= 7) {
				System.out.println("Exame!\n\n");
				exa += 1;
			} else if (media > 7) {
				System.out.println("Aprovado!\n\n");
				apr += 1;
			}

		}

		System.out.println("Alunos aprovados: " + apr);
		System.out.println("Alunos que ficaram no exame: " + exa);
		System.out.println("Alunos reprovados: " + rep);

	}

}
