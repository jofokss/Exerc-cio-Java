import java.util.Scanner;

public class Third {

	public static void main(String[] args) {

		/*
		 * 3. Faça um programa em Java que permita ao usuário escolher a tabuada
		 * que deseja ver. Mostrar a tabuada escolhida. (Comando for)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int sa = sc.nextInt();
		for (int n = 0; n < 11; n++) {
			System.out.println(sa + " x " + n + " = " + (sa * n));

		}

	}

}