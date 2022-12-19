package Mundial;
import java.util.Date;


public class Partido {
  private Date fecha;
  private Equipo local;
  private Equipo visitante;
  private Resultado resultado;


    Partido(){

    }
    Partido(Date fecha, Equipo local, Equipo visitante){
        this.fecha= fecha;
        this.local= local;
        this.visitante= visitante;
    }



  public Resultado getResultado() {

      return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }


    public void anotarGoles(int golesLocal,int golesVisitante){
        this.getResultado().setGolesLocal(golesLocal);
        this.getResultado().setGolesVisitante(golesVisitante);
    }




}
