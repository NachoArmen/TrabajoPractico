package Mundial;
import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private int puntos;
    private int puntajeTotal;
    private ArrayList<Partido> partidos;




    Equipo(){

    }

    public Equipo(String nombreEquipo){
        this.setNombreEquipo(nombreEquipo);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(int puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }


    // CALCULO DE PUNTAJE

    public void puntajeTotal(){
        this.setPuntos(3);
        puntajeTotal=puntos+puntajeTotal;
        this.setPuntos(puntajeTotal);
    }


}
