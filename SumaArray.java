public class SumaArray {
    public static void main(String[]args)
    {

        int[] Arr = new int[3];
        int[] n = {100,80,7};
        int suma = 0;

        for(int i : n)
        {
            System.out.println("Sumamos: " + i);
            suma = suma + i ;
        }

        System.out.println("Mostrar la suma final: " + suma);

    }
}

