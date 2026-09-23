import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char parada;
        do{
            
            System.out.println("deseja continuar?:  ");
            parada = scanner.next().charAt(0);
            
        } while (parada != 'N');
        scanner.close();
        

    }  
}
