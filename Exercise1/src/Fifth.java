import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {

		/*
		 * 5. Um motorista parou no posto de gasolina, comprou dois
		 * refrigerantes e abasteceu o seu carro com gasolina. Leia a quantidade
		 * de litros de gasolina foram necessários para abastecer o veículo e
		 * informe o valor total da conta desse cliente, sabendo-se que cada
		 * refrigerante custou R$3,00 e o litro de gasolina está custando
		 * R$2,50. (Estrutura Sequencial).
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int re = 3;
		double total = 0;

		System.out.println("Quantos litros de gasolina?: ");
		double hie = sc.nextDouble();

		total = (hie * 2.5) + (2 * 3);

		System.out.println("total: R$" + total);

	}

}
