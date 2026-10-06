import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] valores = new int[10];

        for (int i = 2; i < valores.length; i++) {
            valores[i] = i + 1;
        }

        for (int j = 0; j < valores.length; j++) {
            if (valores[j] % 2 == 0) {
                valores[j] = 0;
            }
        }

        System.out.print(Arrays.toString(valores));
    }
}
