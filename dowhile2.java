import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parada;
        do{
            
            System.out.println("deseja continuar?:  ");
            parada = scanner.nextLine();
            
        } while (parada == "N");
        scanner.close();
        

    }  
}
