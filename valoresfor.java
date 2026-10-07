public class Main {
    public static void main(String[] args) {
        int[] valores = new int[10];

        for (int i = 1; i < 10; i++) {
            valores[i-1]=i; 
        }
      
        int[]valores2 = new int [10];
      
        for (int j = 0;j < valores2.length; j++) {
          
            valores2[j] = valores[j] * 2;
        }

        for (int k = valores2.length - 1; k >=0; k--) {
            System.out.print(valores2[k] + " ");
        }
    }
}
