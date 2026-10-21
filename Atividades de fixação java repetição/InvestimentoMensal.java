import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial, depositoMensal, taxaPercentual, meta;
        int prazoMaximo;
        
        do {
            System.out.print("Valor inicial: R$ ");
            valorInicial = scanner.nextDouble();
            System.out.print("Depósito mensal: R$ ");
            depositoMensal = scanner.nextDouble();
            System.out.print("Taxa mensal (%): ");
            taxaPercentual = scanner.nextDouble();
            System.out.print("Meta financeira: R$ ");
            meta = scanner.nextDouble();
            System.out.print("Prazo máximo (1 a 600 meses): ");
            prazoMaximo = scanner.nextInt();
            
            if (valorInicial < 0 || depositoMensal < 0 || taxaPercentual < 0 || meta < 0 || prazoMaximo < 1 || prazoMaximo > 600) {
                System.out.println("Valores inválidos. Certifique-se de que os valores monetários/taxas são positivos e o prazo está entre 1 e 600.");
            }
        } while (valorInicial < 0 || depositoMensal < 0 || taxaPercentual < 0 || meta < 0 || prazoMaximo < 1 || prazoMaximo > 600);
        
        double saldo = valorInicial;
        double taxaDecimal = taxaPercentual / 100.0;
        int mes = 0;
        boolean metaAlcancada = false;
        
        while (mes < prazoMaximo) {
            mes++;
            // Rendimento aplicado antes do depósito
            saldo += saldo * taxaDecimal;
            saldo += depositoMensal;
            
            System.out.printf("Mês %d - Saldo: R$ %.2f\n", mes, saldo);
            
            if (saldo >= meta) {
                metaAlcancada = true;
                break;
            }
        }
        
        System.out.println("\n--- Resultado da Simulação ---");
        System.out.println("Meses decorridos: " + mes);
        System.out.printf("Saldo final: R$ %.2f\n", saldo);
        if (metaAlcancada) {
            System.out.println("A meta foi alcançada!");
        } else {
            System.out.println("A meta NÃO foi alcançada dentro do prazo máximo.");
        }
        
        scanner.close();
    }
}
