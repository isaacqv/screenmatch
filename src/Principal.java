import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    ===== Bienvenido(a) a Screenmatch ======
                    1) Registrar nueva película
                    2) Registrar nueva Serie
                    3) Calculadora de tiempo
                    
                    9) Salir
                    """;
            System.out.println("\n"+menu);
            System.out.println("Ingrese opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    registraDatos(teclado,"pelicula");
//                    System.out.println("Ingrese el titulo: ");
//                    String nombre = teclado.nextLine();
//                    System.out.println("Ingrese el año de lanzamiento: ");
//                    int anioEstreno = teclado.nextInt();
//                    teclado.nextLine();
//                    System.out.println("Ingrese la duración en minutos: ");
//                    int duracionMinutos = teclado.nextInt();
//                    teclado.nextLine();
//                    Pelicula peliculaUsuario = new Pelicula();
//                    peliculaUsuario.setNombre(nombre);
//                    peliculaUsuario.setAnioEstreno(anioEstreno);
//                    peliculaUsuario.setTiempoDuracionMinutos(duracionMinutos);
//                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 2:
                    registraDatos(teclado,"serie");
                    break;
                case 3:
//                    System.out.println("Ingrese si es 'Pelicula' o 'Serie': ");
//                    String tipo = teclado.nextLine();
                    System.out.println("Ingrese el titulo: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento: ");
                    int anioEstreno = teclado.nextInt();
                    teclado.nextLine();
                    //registraDatos(teclado,tipo);
                    Serie serieUsuario  = registrarSerie(teclado, nombre, anioEstreno);

                    System.out.println("Ingrese tiempo (min) a dedicar por día: ");
                    int tiempoXdia = teclado.nextInt();
                    teclado.nextLine();
                    int tiempoTotal = serieUsuario.getTiempoDuracionMinutos();
                    int diasParaFinalizar = tiempoTotal/tiempoXdia;
                    System.out.println("Días necesarios para terminar de ver la Serie: " + diasParaFinalizar);
                    break;
                case 9:
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }

    void registraDatos(Scanner teclado, String tipo){

        System.out.println("Ingrese el titulo: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento: ");
        int anioEstreno = teclado.nextInt();
        teclado.nextLine();
        if (tipo.equalsIgnoreCase("Pelicula")) {
            System.out.println("Ingrese la duración en minutos: ");
            int duracionMinutos = teclado.nextInt();
            teclado.nextLine();
            Pelicula peliculaUsuario = new Pelicula();
            peliculaUsuario.setNombre(nombre);
            peliculaUsuario.setAnioEstreno(anioEstreno);
            peliculaUsuario.setTiempoDuracionMinutos(duracionMinutos);
            peliculaUsuario.muestraFichaTecnica();

        }else if (tipo.equalsIgnoreCase("Serie")){
            Serie serieUsuario  = registrarSerie(teclado, nombre, anioEstreno);
        }

    }

    private static Serie registrarSerie(Scanner teclado, String nombre, int anioEstreno) {
        System.out.println("Ingrese capitulos por temporada: ");
        int capitulosXtemporada = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la duración en minutos por Episodio: ");
        int duracionMinutosSerie = teclado.nextInt();
        teclado.nextLine();
        Serie serieUsuario = new Serie();
        serieUsuario.setNombre(nombre);
        serieUsuario.setAnioEstreno(anioEstreno);
        serieUsuario.setDuracionEnMinutosPorEpisodio(duracionMinutosSerie);
        serieUsuario.setEpisodiosPorTemporada(capitulosXtemporada);
        serieUsuario.muestraFichaTecnica();
        return serieUsuario;
    }
}
