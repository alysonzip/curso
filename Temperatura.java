import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int validas = 0;
        int invalidas = 0;
        double menorTemp = Double.MAX_VALUE;
        double maiorTemp = Double.MIN_VALUE;
        int acaoAquecimento = 0;
        int acaoVentilacao = 0;
        int acaoEstavel = 0;
        
        System.out.println("Digite as temperaturas (999 para encerrar):");
        while (true) {
            double temp = scanner.nextDouble();
            
            if (temp == 999) {
                break;
            }
            
            if (temp < 0 || temp > 60) {
                invalidas++;
                continue;
            }
            
            validas++;
            if (temp < menorTemp) menorTemp = temp;
            if (temp > maiorTemp) maiorTemp = temp;
            
            if (temp < 18) {
                System.out.println("Ação: Ligar o aquecimento.");
                acaoAquecimento++;
            } else if (temp > 30) {
                System.out.println("Ação: Ligar a ventilação.");
                acaoVentilacao++;
            } else {
                System.out.println("Ação: Sistema estável.");
                acaoEstavel++;
            }
        }
        
        System.out.println("\n--- Relatório de Monitoramento ---");
        System.out.println("Leituras válidas: " + validas);
        System.out.println("Leituras inválidas: " + invalidas);
        
        if (validas > 0) {
            System.out.printf("Menor temperatura válida: %.2f °C\n", menorTemp);
            System.out.printf("Maior temperatura válida: %.2f °C\n", maiorTemp);
            System.out.println("Aquecimento indicado: " + acaoAquecimento + " vez(es)");
            System.out.println("Ventilação indicada: " + acaoVentilacao + " vez(es)");
            System.out.println("Sistema estável indicado: " + acaoEstavel + " vez(es)");
        } else {
            System.out.println("Nenhuma leitura válida foi recebida.");
        }
        
        scanner.close();
    }
}
