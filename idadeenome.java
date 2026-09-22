import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe sua idade: ");
        idade=scanner.nextInt();
        if(idade<=0){
            System.out.println(nome + " sua idade e invalida");
        }
        else if (idade<18){
            System.out.println(nome + " e adolescente");
        }
        else if(idade>=18){
            System.out.println(nome + " e adulto");
        }
        scanner.close();
    }
}
