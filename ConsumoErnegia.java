package br.com.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float valorConsumoKwh;
		System.out.println("Informe o valor do consumo: ");

		Scanner scanner = new Scanner(System.in);

		float[] valoresLeituras = new float[Integer.MAX_VALUE];

		int quantValores = 0;

		do {

			valorConsumoKwh = scanner.nextFloat();
			if (valorConsumoKwh >= 0) {

				valoresLeituras[quantValores] = valorConsumoKwh;
				quantValores++;
				float valorConta = 18.50f;

				if (valorConsumoKwh <= 100) {
					valorConta = valorConsumoKwh * 0.75f;
				} else if (valorConsumoKwh <= 200) {
					valorConta = 75 + (valorConsumoKwh) * 0.90f;
				} else {
					valorConta = 165 + (valorConsumoKwh - 200) * 1.20f;
				}
				System.out.println("o valor da conta é :" + valorConta);
			}
		} while (valorConsumoKwh > 0);
		for (int i = 0; i < quantValores; i++) {
			System.out.println(valoresLeituras[i]);
		}

	}

}
