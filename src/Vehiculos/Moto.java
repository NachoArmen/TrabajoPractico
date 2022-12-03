package Vehiculos;

public class Moto extends Vehiculo {
    private String cilindrada;
    private int cantRuedas;



    Moto(){

    }

    Moto(String cilindrada){
        this.setCilindrada(cilindrada);
    }

    Moto(String cilindrada, int cantRuedas){
        this.setCilindrada(cilindrada);
        this.setCantRuedas(cantRuedas);
    }


    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
