package Mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{

    public void jugarPartidos(ArrayList<Equipo> equipos){
        for (int i=0; i<equipos.size();i++){
            for (int j = i+1; j< equipos.size();j++){
                getPartidos().add(new Partido(new Date(),equipos.get(i),equipos.get(j)));
            }
        }
    }

    public ArrayList<Equipo> getEquiposAvanzan(){
        for (int i=0; i<getPartidos().size();i++){
            if (getPartidos().get(i).getResultado().isGanoLocal()){
                getPartidos().get(i).getLocal().puntajeTotal();
            }else{
                getPartidos().get(i).getVisitante().puntajeTotal();
            }
            if (getPartidos().get(i).getLocal().getPuntos()>=6){
                this.getEquiposAvanzan().add(getPartidos().get(i).getLocal());
            } else if (getPartidos().get(i).getVisitante().getPuntos()>=6) {
                this.getEquiposAvanzan().add(getPartidos().get(i).getVisitante());
            }
        }
        return getEquiposAvanzan();
    }

    public Grupo(){
        this.setDescripcionEtapa("Fase de Grupos");
    }





}
