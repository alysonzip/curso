import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int idade,diaSemana;
      float horaSessao;
      float valorPagoIdade = -1;
      float valorDescontoDia = 0;
      float valorPago=0;
      Scanner scanner = new Scanner (System.in);
      System.out.print("informe a idade: ");
      idade = scanner.nextInt();
      while(idade > -1){
        System.out.print("informe o dia [1-7]: ");
        diaSemana = scanner.nextInt();
        System.out.print("Informe a hora da sessão [00.00 - 23.59]: ");
        horaSessao = scanner.nextFloat();
        if (idade >=0 && diaSemana >=1 && diaSemana <=7 && 
        horaSessao >= 00 && horaSessao <= 23.59){
          if(idade < 12){
            valorPagoIdade = 14;
          }
          else if(idade <= 59){
          valorPagoIdade = 24;
          }
          else{
            valorPagoIdade = 16;
          }
          if(diaSemana == 4){
            valorDescontoDia = valorPagoIdade * 0.2f ;
          }
          valorPago = valorPagoIdade - valorDescontoDia;
          if(horaSessao <=16){
            valorPago -= 3;
          }
          
        }
        else{
          System.out.println("valores invalidos!");
        }
          System.out.println("Valor a pagar R$: " + valorPago);
          System.out.print("informe a idade: ");
        idade = scanner.nextInt();

      }
      

    }
}
