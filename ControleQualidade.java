import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aprovadas = 0;
        int abaixoPadrao = 0;
        int acimaPadrao = 0;
        
        System.out.println("Digite as medidas das peças (-1 para encerrar):");
        while (true) {
            double medida = scanner.nextDouble();
            
            if (medida == -1) {
                break;
            }
            
            if (medida < 0) {
                System.out.println("Medida inválida! Ignorada.");
                continue;
            }
            
            if (medida >= 9.5 && medida <= 10.5) {
                System.out.println("Classificação: Aprovada");
                aprovadas++;
            } else if (medida < 9.5) {
                System.out.println("Classificação: Abaixo do padrão");
                abaixoPadrao++;
            } else {
                System.out.println("Classificação: Acima do padrão");
                acimaPadrao++;
            }
        }
        
        int totalValido = aprovadas + abaixoPadrao + acimaPadrao;
        
        System.out.println("\n--- Relatório de Qualidade ---");
        System.out.println("Peças Aprovadas: " + aprovadas);
        System.out.println("Peças Abaixo do padrão: " + abaixoPadrao);
        System.out.println("Peças Acima do padrão: " + acimaPadrao);
        
        if (totalValido > 0) {
            double porcentagemAprovadas = (double) aprovadas / totalValido * 100.0;
            System.out.printf("Porcentagem de peças aprovadas: %.2f%%\n", porcentagemAprovadas);
        } else {
            System.out.println("Nenhuma peça válida foi inspecionada.");
        }
        
        scanner.close();
    }
}
