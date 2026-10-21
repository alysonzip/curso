import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de vendedores: ");
        int qtdVendedores = scanner.nextInt();
        
        double totalEquipe = 0;
        double maiorVenda = -1;
        String codigoMaiorVenda = "";
        int totalBonus = 0;
        
        for (int i = 1; i <= qtdVendedores; i++) {
            System.out.println("\nVendedor " + i);
            System.out.print("Código do vendedor: ");
            String codigo = scanner.next();
            
            double vendas;
            do {
                System.out.print("Total vendido no mês: R$ ");
                vendas = scanner.nextDouble();
                if (vendas < 0) System.out.println("Vendas não podem ser negativas.");
            } while (vendas < 0);
            
            totalEquipe += vendas;
            
            if (vendas > maiorVenda) {
                maiorVenda = vendas;
                codigoMaiorVenda = codigo;
            }
            
            double comissao = 0;
            if (vendas <= 5000) {
                comissao = vendas * 0.03;
            } else if (vendas <= 12000) {
                comissao = vendas * 0.05;
            } else {
                comissao = vendas * 0.08;
            }
            
            double bonus = 0;
            if (vendas >= 20000) {
                bonus = 300.0;
                totalBonus++;
            }
            
            double remuneracaoVariavel = comissao + bonus;
            
            System.out.printf("Comissão: R$ %.2f\n", comissao);
            System.out.printf("Bônus: R$ %.2f\n", bonus);
            System.out.printf("Remuneração variável total: R$ %.2f\n", remuneracaoVariavel);
        }
        
        System.out.println("\n--- Relatório Geral da Equipe ---");
        System.out.printf("Total de vendas da equipe: R$ %.2f\n", totalEquipe);
        System.out.println("Vendedor com maior venda (Código): " + codigoMaiorVenda + " (R$ " + maiorVenda + ")");
        System.out.println("Quantidade de vendedores que receberam bônus: " + totalBonus);
        
        scanner.close();
    }
}
