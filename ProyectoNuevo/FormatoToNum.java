package ProyectoNuevo;

public class FormatoToNum {
    public static void main(String args[]){
        int a, b;
        a = 130;
        b = 7;
        System.out.printf("\nDivision entera: \t %d = %d",a,b,a/b);
        System.out.printf("\nResto de division entera: \t %d %% %d = %d",a,b, a%b);
        System.out.printf("\nDivision real: \t\t %d / %d = %.2f",a,b, (float)a/b);
    }
}
