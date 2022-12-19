package Mundial;
import java.util.ArrayList;


public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    private ArrayList<Equipo> equiposAvanzan;



    EtapaMundial(){
      this.partidos= new ArrayList<Partido>();
      this.equiposAvanzan= new ArrayList<Equipo>();
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

    public ArrayList<Equipo> getEquiposAvanzan() {
        return equiposAvanzan;
    }

    public void setEquiposAvanzan(ArrayList<Equipo> equiposAvanzan) {
        this.equiposAvanzan = equiposAvanzan;
    }
}
