package ProyectoNuevo;

import java.util.Scanner;

public class EjercicioArrayListEntero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de estudiantes");
        int numeroEstudiantes = scanner.nextInt();
        int [] calificaciones = new int[numeroEstudiantes];

        for (int i = 1; i <numeroEstudiantes; i++) {
            System.out.println("Por favor ingrese las calificaciones del estudiante " + (i+1)+": ");
            calificaciones[i] = scanner.nextInt();
        }
        int suma =0;
        for(int i = 1; i <numeroEstudiantes; i++) {
            suma += calificaciones[i];
        }
        double promedio = (double)suma/numeroEstudiantes;
        System.out.println("El promedio de todas las calificaciones es: " + promedio);

    }
}
