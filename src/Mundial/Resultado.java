package Mundial;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;
    private boolean ganoLocal;
    private boolean empate;


    Resultado(){
        this.golesLocal = 3;
        this.golesVisitante= 3;
        this.ganoLocal = false;
        this.empate = true;
    }

    Resultado(int golesLocal, int golesVisitante, boolean empate){
        this.golesLocal = golesLocal;
        this.golesVisitante= golesVisitante;
        this.empate= true;
    }


    public int getGolesLocal() {

        return golesLocal;
    }

    public void setGolesLocal(int golesLocal){
        this.golesLocal= golesLocal;
    }

    public int getGolesVisitante() {

        return golesVisitante;
    }
    public void setGolesVisitante(int golesVisitante){
        this.golesVisitante= golesVisitante;
    }

    public boolean isGanoLocal() {

        return ganoLocal;
    }

    public void setGanoLocal(boolean ganoLocal) {

        this.ganoLocal = ganoLocal;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
    }
}
