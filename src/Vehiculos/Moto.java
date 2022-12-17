package Vehiculos;

public class Moto extends Vehiculo {
    private String cilindrada;
    private int cantRuedas;



    Moto(){

    }

    Moto(String cilindrada){
        this.setCilindrada(cilindrada);
    }

    Moto(String cilindrada, int cantRuedas, String marca, String patente, String color, double kilometraje){
        this.setCilindrada(cilindrada);
        this.setCantRuedas(cantRuedas);
        this.setMarca(marca);
        this.setKilometraje(kilometraje);
        this.setPatente(patente);
        this.setColor(color);
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
