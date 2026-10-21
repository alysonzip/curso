import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o saldo inicial da conta: R$ ");
        double saldo = scanner.nextDouble();
        
        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {
            System.out.print("\nInforme o valor do saque: R$ ");
            double saque = scanner.nextDouble();
            
            if (saque <= 0 || saque % 5 != 0 || saque > saldo) {
                System.out.println("Saque inválido! Verifique se o valor é positivo, múltiplo de 5 e menor ou igual ao saldo.");
            } else {
                saldo -= saque;
                int valorRestante = (int) saque;
                
                int c100 = valorRestante / 100;
                valorRestante %= 100;
                
                int c50 = valorRestante / 50;
                valorRestante %= 50;
                
                int c20 = valorRestante / 20;
                valorRestante %= 20;
                
                int c10 = valorRestante / 10;
                valorRestante %= 10;
                
                int c5 = valorRestante / 5;
                
                System.out.println("Saque realizado com sucesso! Cédulas entregues:");
                if (c100 > 0) System.out.println("- R$ 100: " + c100);
                if (c50 > 0) System.out.println("- R$ 50: " + c50);
                if (c20 > 0) System.out.println("- R$ 20: " + c20);
                if (c10 > 0) System.out.println("- R$ 10: " + c10);
                if (c5 > 0) System.out.println("- R$ 5: " + c5);
                
                System.out.printf("Saldo restante: R$ %.2f\n", saldo);
            }
            
            System.out.print("\nDeseja realizar outra operação? (S/N): ");
            continuar = scanner.next().charAt(0);
        }
        
        System.out.println("Caixa eletrônico encerrado.");
        scanner.close();
    }
}
