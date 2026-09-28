import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args){

        Scanner lector=new Scanner (System.in);

        String Nombre;
        int edad;
        boolean esVerdad;
        double altura;
        char inicial;

        System.out.println("escribe un nombre");
        Nombre=lector.nextLine();
        System.out.println("escribe una edad");
        edad=lector.nextInt();

        lector.nextLine();

        System.out.println("Es estudiante?");
        esVerdad=lector.nextBoolean();

        lector.nextLine();

        System.out.println("escribe la altura");
        altura=lector.nextDouble();

        System.out.println("Escribe la inicial del nombre");
        inicial=lector.next().charAt(0);

        System.out.println("\n--- Valores y Tipos de Datos ---");

        System.out.println("Nombre: "+Nombre+" - Tipo: String");
        System.out.println("Edad: "+edad+" - Tipo: int");
        System.out.println("¿Es estudiante?: "+esVerdad+" - Tipo: boolean");
        System.out.println("Altura: "+altura+" - Tipo: double");
        System.out.println("Inicial: "+inicial+" - Tipo: char");


    }
}
