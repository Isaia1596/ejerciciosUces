package ProyectoNuevo;

import java.util.Scanner;

public class MayorDeTres {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Introduzca el primer numero: ");
        a = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        b = sc.nextInt();
        System.out.print("Introduzca tercer numero: ");
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("El mayor es a: " + a);
            } else {
                System.out.println("El mayor es c: " + c);
            }
        }else{
            if (b > c) {
                System.out.println("el mayor es: " + b);
            }else{
                System.out.println("el mayor es: " + c);

            }
        }
    }

}
