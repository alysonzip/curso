import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de estudantes: ");
        int qtdEstudantes = scanner.nextInt();
        
        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;
        double maiorMedia = -1;
        
        for (int i = 1; i <= qtdEstudantes; i++) {
            System.out.println("\nEstudante " + i);
            double n1, n2, n3;
            
            do {
                System.out.print("Digite a nota 1 (0 a 10): ");
                n1 = scanner.nextDouble();
            } while (n1 < 0 || n1 > 10);
            
            do {
                System.out.print("Digite a nota 2 (0 a 10): ");
                n2 = scanner.nextDouble();
            } while (n2 < 0 || n2 > 10);
            
            do {
                System.out.print("Digite a nota 3 - Exame final (0 a 10): ");
                n3 = scanner.nextDouble();
            } while (n3 < 0 || n3 > 10);
            
            // Regra de substituição
            double notaMenor = (n1 < n2) ? n1 : n2;
            double mediaFinal;
            
            if (n3 > notaMenor) {
                if (n1 == notaMenor) {
                    mediaFinal = (n3 + n2) / 2.0;
                } else {
                    mediaFinal = (n1 + n3) / 2.0;
                }
            } else {
                mediaFinal = (n1 + n2) / 2.0;
            }
            
            if (mediaFinal > maiorMedia) {
                maiorMedia = mediaFinal;
            }
            
            System.out.printf("Média final: %.2f - Situação: ", mediaFinal);
            if (mediaFinal >= 7.0) {
                System.out.println("Aprovado");
                aprovados++;
            } else if (mediaFinal >= 5.0) {
                System.out.println("Recuperação");
                recuperacao++;
            } else {
                System.out.println("Reprovado");
                reprovados++;
            }
        }
        
        System.out.println("\n--- Relatório da Turma ---");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        System.out.printf("Maior média da turma: %.2f\n", maiorMedia);
        
        scanner.close();
    }
}
