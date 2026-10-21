import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;
        boolean senhaValida = false;
        
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + " - Digite a senha: ");
            String senha = scanner.next();
            
            boolean temTamanho = senha.length() >= 8;
            boolean temMaiuscula = false;
            boolean temMinuscula = false;
            boolean temDigito = false;
            boolean temEspecial = false;
            
            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) temMaiuscula = true;
                else if (Character.isLowerCase(c)) temMinuscula = true;
                else if (Character.isDigit(c)) temDigito = true;
                else if ("@#$%&".indexOf(c) != -1) temEspecial = true;
            }
            
            if (temTamanho && temMaiuscula && temMinuscula && temDigito && temEspecial) {
                System.out.println("Senha cadastrada com sucesso!");
                senhaValida = true;
                break;
            } else {
                System.out.println("A senha não atende aos requisitos. Pendências:");
                if (!temTamanho) System.out.println("- Deve ter pelo menos 8 caracteres.");
                if (!temMaiuscula) System.out.println("- Deve conter ao menos uma letra maiúscula.");
                if (!temMinuscula) System.out.println("- Deve conter ao menos uma letra minúscula.");
                if (!temDigito) System.out.println("- Deve conter ao menos um dígito.");
                if (!temEspecial) System.out.println("- Deve conter ao menos um caractere especial entre @, #, $, %, &.");
            }
        }
        
        if (!senhaValida) {
            System.out.println("\nNúmero máximo de tentativas atingido. Acesso negado.");
        }
        
        scanner.close();
    }
}
