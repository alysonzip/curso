import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int posPares = 0;
        int posImpares = 0;
        int negPares = 0;
        int negImpares = 0;
        int maiorPositivo = -1;
        boolean temPositivo = false;
        
        System.out.println("Digite números inteiros (0 para encerrar):");
        while (true) {
            int num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num > 0) {
                if (num % 2 == 0) {
                    posPares++;
                } else {
                    posImpares++;
                }
                if (!temPositivo || num > maiorPositivo) {
                    maiorPositivo = num;
                    temPositivo = true;
                }
            } else {
                if (num % 2 == 0) {
                    negPares++;
                } else {
                    negImpares++;
                }
            }
        }
        
        System.out.println("\n--- Análise da Sequência ---");
        System.out.println("Positivos Pares: " + posPares);
        System.out.println("Positivos Ímpares: " + posImpares);
        System.out.println("Negativos Pares: " + negPares);
        System.out.println("Negativos Ímpares: " + negImpares);
        
        if (temPositivo) {
            System.out.println("Maior número positivo: " + maiorPositivo);
        } else {
            System.out.println("Nenhum número positivo foi informado.");
        }
        
        scanner.close();
    }
}
