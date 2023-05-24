package ProyectoNuevo;

public class OppNull{
    public static void main(String args[]) {
         prompUser();
    }
    private static void prompUser(){//metodo que ejecuta si el valor entrado es null o vacio
        String name = "pablo";// si dejo las " " sin argumentos dira no entro en su nombre (no colocar null)
        if(name == null || name.trim().isEmpty()){//funcion trim().isEmpty()
            System.out.println("No entro su nombre");
        }else{
            System.out.println("Entro su nombre: " + name);
        }
    }
}
