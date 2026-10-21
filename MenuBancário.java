import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o saldo inicial da conta: R$ ");
        double saldo = scanner.nextDouble();
        
        int qtdDepositos = 0;
        int qtdSaques = 0;
        double maiorSaque = 0;
        
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Depósito inválido! O valor deve ser positivo.");
                    } else {
                        saldo += deposito;
                        qtdDepositos++;
                        System.out.printf("Depósito realizado. Saldo atual: R$ %.2f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= 0 || saque > saldo) {
                        System.out.println("Saque inválido! Valor positivo e saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        qtdSaques++;
                        if (saque > maiorSaque) {
                            maiorSaque = saque;
                        }
                        System.out.printf("Saque realizado. Saldo atual: R$ %.2f\n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema bancário.");
                    break;
                default:
                    System.out.println("Opção inexistente! Tente novamente.");
            }
        }
        
        System.out.println("\n--- Relatório Final da Conta ---");
        System.out.println("Depósitos concluídos: " + qtdDepositos);
        System.out.println("Saques concluídos: " + qtdSaques);
        System.out.printf("Maior valor de saque realizado: R$ %.2f\n", maiorSaque);
        System.out.printf("Saldo final: R$ %.2f\n", saldo);
        
        scanner.close();
    }
}
