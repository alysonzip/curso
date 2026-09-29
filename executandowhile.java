import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Executando algo");
            System.out.print("Deseja continuar (SIM/NÃO): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("SIM"));

        scanner.close();
    }
}
