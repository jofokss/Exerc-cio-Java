import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * 8. Leia uma relação de pacientes de uma clínica, cada um com o nome,
		 * o sexo, o peso, a idade e a altura. Para sinalizar o fim da lista
		 * será fornecido “fim” no nome do último paciente.
		 * 
		 * Exiba um relatório contendo: 
		 * • a quantidade de pacientes. 
		 * • a média de idade dos homens. 
		 * • a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg. 
		 * • a quantidade de pessoas com idade entre 18 e 25. 
		 * • o nome do paciente mais velho. 
		 * • o nome da mulher mais baixa.
		 */
		
		int pac = 0;
		int med = 0;
		int med1 = 0;
		int wo = 0;
		int you = 0;
		int di = 0;
		int np = 0;
		int rar = 0;
		double la = 0;
		String na = "";
		String nam = "";

		while (rar == 0) {
			System.out.println("\n\n\n\n\n\n\nDigite o seu nome: ");
			String no = sc.nextLine();

			if (no.equals("fim")) {
				rar = 1;
			} else if (no != "fim") {

				System.out.println("Digite o seu sexo = (1) feminino, (2) masculino: ");
				int se = sc.nextInt();
				System.out.println("Digite o seu peso: ");
				int pe = sc.nextInt();
				System.out.println("Digite a sua idade: ");
				int id = sc.nextInt();
				System.out.println("Digite a sua altura: ");
				double al = sc.nextDouble();
				sc.nextLine();
				pac += 1;

				if (id >= 18 && id <= 25) {
					you += 1;
				}

				if (se == 2) {
					med += id;
					np += 1;
				}

				if (id > di) {
					di = id;
					na = no;
				}

				if (la == 0 && se == 1) {
					la = al;
				}

				if (al < la && se == 1) {
					la = al;
					nam = no;
				}

				if (al >= 1.60 && al <= 1.70 && pe > 70) {
					wo += 1;
				}

			}
		}

		if (np == 0) {
			np = 1;
		}

		System.out.println("\n\n\nNumero de pacientes: " + pac);
		System.out.println("Média de idade dos homens: " + med / np);
		System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + wo);
		System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + you);
		System.out.println("Nome do paciente mais velho: " + na);
		System.out.println("Nome da mulher mais baixa: " + nam);
	}

}
