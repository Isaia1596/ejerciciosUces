package ProyectoNuevo;

public class ForIntExt {
    public static void main(String args[]) {
        int contador; //declaracion variable
        for(contador = 0; contador <= 1; contador++) {//1° condiciona(0<=1)si
            System.out.println("repeticion numero :" + contador);
            //2° imprime el cero (0) luego incrementa pasando a (1)
            //pregunta (1<=1) es igual, e imprime (1) incrementa en (2)
            // sale como valor  final (2) condiciona y se corta por ser mayor
        }
        System.out.println("valor final :" + contador);// da el valor final
    }
}
