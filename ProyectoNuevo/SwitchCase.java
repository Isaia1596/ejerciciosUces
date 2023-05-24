package ProyectoNuevo;

public class SwitchCase {
    public static void main(String args[]) {
        char x = 'a'; //entrada de selccion (a y b)
        switch (x) { //switch inicio
            case 'a': {
                System.out.println("Esta es la opcion 0");
                break;
            }
            case 'b': {
                System.out.println("Esta es la opcion 1");
                break;
            }
            default:
        }
        System.out.println("Esta opcion es la opcion por defecto");
    }
}// switch final

