import java.util.Scanner;

public class EjercicioDos {
    public static void main (String[] arg)
    {
        //modificar variables
        //Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.

        Scanner lector=new Scanner(System.in);

        int numero;
        int aux;
        System.out.println("puntuacion inicial");
            numero=lector.nextInt();
                aux=numero;
        System.out.println("Despues de primera modificación");
            numero=lector.nextInt();
                aux=aux+numero;
        System.out.println("Despues de la segunda modificación");
            numero=lector.nextInt();
                aux=aux+numero;

                System.out.println("puntuación final:"+aux);
    }
}
