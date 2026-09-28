import java.util.Scanner;

public class EjercicioUno {
    public static void main (String[] args){
        //Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe un nombre");
            String Nombre=lector.nextLine();
        System.out.println("Escribe tu edad");
            int edad=lector.nextInt();
                //refrescar el salto de linea
                lector.nextLine();
        System.out.println("Escribe tu ciudad");
            String Ciudad=lector.nextLine();

        System.out.println(Nombre);
        System.out.println(edad);
        System.out.println(Ciudad);
    }
}
