import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaContas = 0;
        int totalResidencias = 0;
        int acima300 = 0;
        
        while (true) {
            System.out.print("Digite o consumo em kWh (-1 para sair): ");
            double consumo = scanner.nextDouble();
            
            if (consumo == -1) {
                break;
            }
            
            if (consumo < 0) {
                System.out.println("Consumo inválido! Tente novamente.");
                continue;
            }
            
            double subtotal = 18.50; // Tarifa básica
            
            if (consumo <= 100) {
                subtotal += consumo * 0.75;
            } else if (consumo <= 200) {
                subtotal += (100 * 0.75) + ((consumo - 100) * 0.90);
            } else if (consumo <= 300) {
                subtotal += (100 * 0.75) + (100 * 0.90) + ((consumo - 200) * 1.20);
            } else {
                subtotal += (100 * 0.75) + (100 * 0.90) + (100 * 1.20) + ((consumo - 300) * 1.20);
                subtotal += subtotal * 0.08; // Adicional de 8% sobre o subtotal
                acima300++;
            }
            
            System.out.printf("Valor da conta: R$ %.2f\n", subtotal);
            somaContas += subtotal;
            totalResidencias++;
        }
        
        if (totalResidencias > 0) {
            double media = somaContas / totalResidencias;
            System.out.println("\n--- Resumo Final ---");
            System.out.printf("Média das contas: R$ %.2f\n", media);
            System.out.println("Residências com consumo acima de 300 kWh: " + acima300);
        } else {
            System.out.println("Nenhuma residência registrada.");
        }
        
        scanner.close();
    }
}
