public class NumerosPares {
    public static void main(String[] args){
        int numero = 1;

        while (numero <= 100){
            if (numero % 2 == 0){
                System.out.print(numero + " " + "");
            }

            numero++;
        }

        System.out.println();
    }
}
