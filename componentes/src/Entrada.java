public class Entrada {
    public static void main(String[] args){
        //comentario simple
        /* comentario largo */
        //TODO este es un recordatorio pendiente

        //variables: String,char,byte/shot/int/long, double/float, boolean
        //ordenes
        System.out.println("hola mundo");
        System.out.println("a");
        System.out.println(9+6);
        System.out.println(7.98);//puntos para las comas, cuando se hace lectura por teclado es coma, cuando se escribe es punto
        System.out.println(true);
        System.out.println('a'); //imprime una letra

        //la suma de 9 y 6 es 15
        System.out.println("la suma de "+9+" y "+6+" es "+(9+6));

        //tipo nombre = valor
        String nombreLegal= "Encinas";
        nombreLegal="Julio";
            System.out.println(nombreLegal);

        //numero
        int edad = 28;

        //boolean
        boolean acierto=true;
        System.out.println("numero int: "+edad);
        System.out.println("boolean acierto es: "+acierto);

        /*Segun la forma de construirse: primitivas (solo guarda un valor)
        compleja (ademas del valor y la funcionalidad)
        primitivos: int,double,char
        complejos: todos aquellos que empiecen con MAYUS
        se puede cambiar una primitiva a compleja
     */
        double altura = 1.83;
        Double AlturaCompleja=altura;

    //segun mutabilidad/no mutable (constante)
        //para hacerlo no mutable que no pueda cambiar añade final
           // String dni = "123123A";
            final String dni = "123123A";
            //la buena practica hace que tener el nombre en MAYUS (DNI) son constantes

        //ejemplo
    }
}
