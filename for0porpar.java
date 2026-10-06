class Main {
    public static void main(String[] args) {
        int[] valores = new int[10];

        for (int i = 2; i < valores.length; i++) {
            valores[i] = i + 1;
        }

        for (int j = 0; j < valores.length; j++) {
            System.out.print(valores[j] + " ");
        }

        for (int k = 1; k < valores.length; k += 2) {
            valores[k] = 0;
        }

        System.out.println();

        for (int l = 0; l < valores.length; l++) {
            System.out.print(valores[l] + " ");
        }
    }
}
