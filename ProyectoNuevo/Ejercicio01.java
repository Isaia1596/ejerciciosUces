package ProyectoNuevo;

public class Ejercicio01 {
    public static void main(String[] args) {
        String[] palabras = {"pepe", "jose","carlos","matias" ,"marta"};
        char caracter='m';
        int contadorpalabras=0;
        for(String palabra : palabras){
            if (palabra.charAt(0)== caracter) {
                contadorpalabras++;
            }
        }
        System.out.println("La cantidad de palabras que comienzen con la letra: " + caracter + "es : " + contadorpalabras);

    }
}
