import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.print("Informe seu nome; ");
        nome = scanner.nextLine();
        System.out.println("Boa noite " + nome);
        scanner.close();
    }
