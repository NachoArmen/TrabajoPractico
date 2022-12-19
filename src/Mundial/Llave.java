package Mundial;

import java.util.ArrayList;
import java.util.Date;

public class Llave extends EtapaMundial {

    public void jugarPartidos(ArrayList<Equipo> equipos){
        for (int i=0; i<equipos.size(); i+=2){
            getPartidos().add(new Partido(new Date(),equipos.get(i),equipos.get(i+1)));
        }
    }

    public ArrayList<Equipo> getEquiposAvanzan(){
        for (int i=0; i< getPartidos().size();i++){
            if (getPartidos().get(i).getResultado().isGanoLocal()){
                this.getEquiposAvanzan().add(getPartidos().get(i).getLocal());
            }else{
                this.getEquiposAvanzan().add(getPartidos().get(i).getVisitante());
            }
        }
        return getEquiposAvanzan();
    }
}
