import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("Informe sua idade:");
        idade=scanner.nextInt();
        if(idade<0){
            System.out.println("idade invalida");
        }
        else if (idade<18){
            System.out.println("Adolescente");
        }
        else if(idade>=18){
            System.out.println("Adulto");
        }
        scanner.close();
    }
}
