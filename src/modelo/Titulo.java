package modelo;

public class Titulo {
    private String nombre;
    private int anioEstreno;
    private double evaluacion;
    private boolean incluidoPlanBasico;
    private String sinopsis;
    private int tiempoDuracionMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public boolean isIncluidoPlanBasico() {
        return incluidoPlanBasico;
    }

    public void setIncluidoPlanBasico(boolean incluidoPlanBasico) {
        this.incluidoPlanBasico = incluidoPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getTiempoDuracionMinutos() {
        return tiempoDuracionMinutos;
    }

    public void setTiempoDuracionMinutos(int tiempoDuracionMinutos) {
        this.tiempoDuracionMinutos = tiempoDuracionMinutos;
    }

    public void muestraFichaTecnica(){
        System.out.println("\n**** FICHA TÉCNICA *****");
        System.out.println("Nombre del título: " + nombre);
        System.out.println("Año de Lanzamiento: " + anioEstreno);
        System.out.println("Tiempo de duración: " + getTiempoDuracionMinutos() + " min");
    }
}
