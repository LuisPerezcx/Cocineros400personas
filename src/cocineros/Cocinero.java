package cocineros;

public class Cocinero {
    int id;
    String nombre;
    double tiempoCocina;
    static int contador=1;
    static String especialidadCocina = "Comida Internacional";
    static double tiempoCocinaEquipo=0;
    public Cocinero(){

    }
    public Cocinero(String nombre, double tiempoCocina) {
        this.id = contador;
        this.nombre = nombre;
        this.tiempoCocina = tiempoCocina;
        contador++;
        tiempoCocinaEquipo = tiempoCocinaEquipo + tiempoCocina;
    }
    @Override
    public String toString(){
        return "Cocinero " + id + "\t\t" + nombre + "\t\t" + tiempoCocina + " horas" + "\t\t\t"+ especialidadCocina;
    }

    public static double getTiempoCocinaEquipo() {
        return tiempoCocinaEquipo;
    }
}
