package Mundial;
import java.util.ArrayList;


public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;



    EtapaMundial(){

    }
    public String getDescripcionEtapa() {

        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {

        this.descripcionEtapa = descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
}
