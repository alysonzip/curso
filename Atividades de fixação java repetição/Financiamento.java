import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            double preco, entrada, taxa;
            int parcelas;
            
            do {
                System.out.print("Informe o valor do produto: R$ ");
                preco = scanner.nextDouble();
                if (preco <= 0) System.out.println("Valor inválido.");
            } while (preco <= 0);
            
            do {
                System.out.print("Informe o valor da entrada: R$ ");
                entrada = scanner.nextDouble();
                if (entrada < 0 || entrada >= preco) {
                    System.out.println("Entrada inválida (deve ser menor que o preço e positiva).");
                }
            } while (entrada < 0 || entrada >= preco);
            
            do {
                System.out.print("Informe a quantidade de parcelas (1 a 48): ");
                parcelas = scanner.nextInt();
                if (parcelas < 1 || parcelas > 48) {
                    System.out.println("Quantidade de parcelas inválida.");
                }
            } while (parcelas < 1 || parcelas > 48);
            
            do {
                System.out.print("Informe a taxa de juros mensal em % (0 a 10): ");
                taxa = scanner.nextDouble();
                if (taxa < 0 || taxa > 10) {
                    System.out.println("Taxa inválida.");
                }
            } while (taxa < 0 || taxa > 10);
            
            double valorFinanciado = preco - entrada;
            double taxaDecimal = taxa / 100.0;
            // Juros simples: Total = Financiado * (1 + taxa * meses)
            double totalParcelado = valorFinanciado * (1 + (taxaDecimal * parcelas));
            double valorParcela = totalParcelado / parcelas;
            
            System.out.println("\n--- Simulação de Financiamento ---");
            System.out.printf("Valor Financiado: R$ %.2f\n", valorFinanciado);
            System.out.printf("Total com Juros: R$ %.2f\n", totalParcelado);
            System.out.printf("Valor de cada parcela (%d vezes): R$ %.2f\n", parcelas, valorParcela);
            
            while (true) {
                System.out.print("\nDeseja simular outro financiamento? (S/N): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("N")) {
                    continuar = resposta.charAt(0);
                    break;
                }
                System.out.println("Resposta inválida! Digite S ou N.");
            }
        }
        
        System.out.println("Simulador encerrado.");
        scanner.close();
    }
}
