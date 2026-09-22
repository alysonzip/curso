import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor:");
        valor = scanner.nextInt();
        int cont =1;
        while (cont <= 10) {
            System.out.println(valor*cont);
            cont++;
        }
        scanner.close();
    }
}
