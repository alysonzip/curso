import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de atletas: ");
        int nAtletas = scanner.nextInt();
        
        double melhorTempo = Double.MAX_VALUE;
        double piorTempo = Double.MIN_VALUE;
        double somaTempos = 0;
        double[] tempos = new double[nAtletas];
        
        for (int i = 0; i < nAtletas; i++) {
            double tempo;
            do {
                System.out.print("Informe o tempo do atleta " + (i + 1) + " (minutos): ");
                tempo = scanner.nextDouble();
                if (tempo <= 0 || tempo > 300) {
                    System.out.println("Tempo inválido! Deve ser maior que 0 e até 300 minutos.");
                }
            } while (tempo <= 0 || tempo > 300);
            
            tempos[i] = tempo;
            somaTempos += tempo;
            
            if (tempo < melhorTempo) melhorTempo = tempo;
            if (tempo > piorTempo) piorTempo = tempo;
        }
        
        double media = somaTempos / nAtletas;
        double limiteLimite = melhorTempo * 1.10; // até 10% acima do melhor tempo
        int qtdAcimaMelhor = 0;
        
        for (double t : tempos) {
            if (t <= limiteLimite) {
                qtdAcimaMelhor++;
            }
        }
        
        System.out.println("\n--- Estatísticas da Corrida ---");
        System.out.printf("Melhor tempo: %.2f minutos\n", melhorTempo);
        System.out.printf("Pior tempo: %.2f minutos\n", piorTempo);
        System.out.printf("Tempo médio: %.2f minutos\n", media);
        System.out.println("Atletas até 10% acima do melhor tempo: " + qtdAcimaMelhor);
        
        scanner.close();
    }
}
