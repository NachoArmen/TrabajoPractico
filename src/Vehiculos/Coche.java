package Vehiculos;

public class Coche extends Vehiculo {
    private int cantPuertas;
    private int cantRuedas;


    Coche(){

    }

    Coche(int cantPuertas){
        this.setCantPuertas(cantPuertas);
    }

    Coche(int cantPuertas, int cantRuedas){
        this.setCantPuertas(cantPuertas);
        this.setCantRuedas(cantRuedas);
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
