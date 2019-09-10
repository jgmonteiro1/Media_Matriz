package program;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[][] matriz = new double[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}

		double aux = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				aux += matriz[i][j];
			}
		}

		double media = aux / 4;

		System.out.println("Média: " + media);

		sc.close();
	}
}