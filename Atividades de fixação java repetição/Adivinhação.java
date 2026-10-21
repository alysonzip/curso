import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroSecreto;
        do {
            System.out.print("Defina o número secreto (entre 1 e 100): ");
            numeroSecreto = scanner.nextInt();
            if (numeroSecreto < 1 || numeroSecreto > 100) {
                System.out.println("Número fora do intervalo permitido.");
            }
        } while (numeroSecreto < 1 || numeroSecreto > 100);
        
        int maxTentativas = 7;
        int tentativasUsadas = 0;
        boolean acertou = false;
        
        while (tentativasUsadas < maxTentativas) {
            System.out.print("Tentativa " + (tentativasUsadas + 1) + " - Digite seu palpite (1 a 100): ");
            int palpite = scanner.nextInt();
            
            if (palpite < 1 || palpite > 100) {
                System.out.println("Palpite inválido! Não consome tentativa.");
                continue;
            }
            
            tentativasUsadas++;
            
            if (palpite == numeroSecreto) {
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } else {
                System.out.println("O número secreto é MENOR.");
            }
        }
        
        System.out.println("\n--- Resultado do Jogo ---");
        if (acertou) {
            System.out.println("Você acertou em " + tentativasUsadas + " tentativa(s)!");
            System.out.print("Classificação: ");
            if (tentativasUsadas <= 2) {
                System.out.println("Excelente");
            } else if (tentativasUsadas <= 5) {
                System.out.println("Bom");
            } else {
                System.out.println("Concluído");
            }
        } else {
            System.out.println("Acabaram as suas tentativas! Você não acertou.");
            System.out.println("O número secreto era: " + numeroSecreto);
        }
        
        scanner.close();
    }
}
