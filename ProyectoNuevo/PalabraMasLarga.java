package ProyectoNuevo;

public class PalabraMasLarga {
    private static String encontarPalabraMasLarga(String[] arreglo){
        String palabraMasLarga = " ";
        for (String palabra : arreglo) {
            if (palabra.length() > palabraMasLarga.length()){

            }
        }
        return palabraMasLarga;

    }

    public static void main(String[] args){
        String[] arrreglo = {"pedro","micaela","jose","valeria"};
        String palabraMasLarga = encontarPalabraMasLarga(arrreglo);
        System.out.println("La palabra mas larga es: " + palabraMasLarga);
    }
}
