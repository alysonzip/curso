class Main {
    public static void main(String[] args) {
        String[] stackCoffee = new String [5];
        for(int i = 0; i<stackCoffee.length;i++){
            stackCoffee[i] = "coffee";
            System.out.println(i);
        }
        for(int j=stackCoffee.length-1;j>=0;j--){
            stackCoffee[j]="";
            System.out.println (j);
        }
    }
}
