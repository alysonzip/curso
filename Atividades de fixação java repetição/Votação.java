import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int votos10 = 0;
        int votos20 = 0;
        int votos30 = 0;
        int brancos = 0;
        int nulos = 0;
        int invalidos = 0;
        
        System.out.println("Digite os votos (-9 para encerrar):");
        while (true) {
            int voto = scanner.nextInt();
            
            if (voto == -9) {
                break;
            }
            
            switch (voto) {
                case 10:
                    votos10++;
                    break;
                case 20:
                    votos20++;
                    break;
                case 30:
                    votos30++;
                    break;
                case 0:
                    brancos++;
                    break;
                case -1:
                    nulos++;
                    break;
                default:
                    invalidos++;
                    break;
            }
        }
        
        int votosValidos = votos10 + votos20 + votos30;
        
        System.out.println("\n--- Apuração da Votação ---");
        System.out.println("Votos Candidato 10: " + votos10);
        System.out.println("Votos Candidato 20: " + votos20);
        System.out.println("Votos Candidato 30: " + votos30);
        System.out.println("Votos em Branco: " + brancos);
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos Inválidos: " + invalidos);
        
        if (votosValidos > 0) {
            System.out.printf("Percentual Candidato 10: %.2f%%\n", (double) votos10 / votosValidos * 100);
            System.out.printf("Percentual Candidato 20: %.2f%%\n", (double) votos20 / votosValidos * 100);
            System.out.printf("Percentual Candidato 30: %.2f%%\n", (double) votos30 / votosValidos * 100);
            
        
            int maxVotos = Math.max(votos10, Math.max(votos20, votos30));
            int countEmpate = 0;
            if (votos10 == maxVotos) countEmpate++;
            if (votos20 == maxVotos) countEmpate++;
            if (votos30 == maxVotos) countEmpate++;
            
            if (countEmpate > 1) {
                System.out.println("\nResultado: Houve um EMPATE entre os candidatos com " + maxVotos + " votos válidos.");
            } else {
                System.out.print("\nVencedor da eleição: Candidato ");
                if (votos10 == maxVotos) System.out.println("10");
                else if (votos20 == maxVotos) System.out.println("20");
                else System.out.println("30");
            }
        } else {
            System.out.println("\nNenhum voto válido foi registrado.");
        }
        
        scanner.close();
    }
}
