package Mundial;
import java.util.Date;


public class Partido {
  private Date fecha;
  private Equipo local;
  private Equipo visitante;
  private Resultado resultado;


    public Resultado getResultado() {
        return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }
}
