import java.util.Scanner;
public class main{
  public static void main (String[] args) {
    float[] notas = new float[4];
    Scanner scanner = new Scanner(System.in);
    for(int i=0; i<notas.length; i++){
        notas[i] = scanner.nextFloat();

    }
    System.out.println("a medida das somas é: ");
    float soma = 0;
    for(int j=0 ; j<notas.length ; j++){
      soma += notas[j];

    }
    System.out.println(soma/notas.length);
  }




}
