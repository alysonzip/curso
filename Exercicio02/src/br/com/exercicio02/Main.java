package br.com.exercicio02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float valorConsumoKwh;
		System.out.println("Informe o valor do consumo: ");
		valorConsumoKwh = scanner.nextFloat();
		float valorConta = 0;
		if(valorConsumoKwh <= 100) {
			valorConta = valorConsumoKwh * 0.75f;
		}
		else if(valorConsumoKwh <=200) {
			valorConta = 75 + (valorConsumoKwh) * 0.90f;
		}
		else {
			valorConta = 165+(valorConsumoKwh-200)*1.20f;
		}
		System.out.println("o valor da conta é :" + valorConta);
		
	} 

}

