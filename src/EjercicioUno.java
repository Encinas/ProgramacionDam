import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        //Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.

        Scanner lector=new Scanner(System.in);
        int edad;

        System.out.println("Escribe tu nombre");
            String Nombre=lector.nextLine();
        System.out.println("Escribe tu edad");
            edad=lector.nextInt();
        //consumimos el "Enter" que quedó en memoria
        lector.nextLine();

        System.out.println("Escribe tu ciudad");
            String Ciudad=lector.nextLine();



        System.out.println(Nombre);
        System.out.println(edad);
        System.out.println(Ciudad);


    }
}
