import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");
        String nombrePelicula = "Matrix";
        System.out.println("Pelicula "+nombrePelicula);

        int anioEstreno = 1999;
        double valoracion = 0;
        int intentos = 4;
        int contador = 0;
        double mediaEvaluacion = 0;
        boolean incluidoPlanBasico = true;
        String sinopsis = """
                La mejor película del fin del milenio,
                sin duda te volará la cabeza.
                """;
        System.out.println("-------------------------");
        System.out.println(sinopsis);
        System.out.println(incluidoPlanBasico);
        if (anioEstreno>2000){
            System.out.println("Pelicula popular en el momento");
        }
        System.out.println("Película Retro que vale la pena ver");

        while (contador < intentos){
            contador++;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese su valoración: ");
            valoracion = valoracion + teclado.nextDouble();
        }

        mediaEvaluacion = valoracion/intentos;

        System.out.println("La media de evaluacion es: "+mediaEvaluacion);

    }
}