package Vehiculos;

public class Coche extends Vehiculo {
    private int cantPuertas;


    Coche(){

    }

    Coche(int cantPuertas){
        this.setCantPuertas(cantPuertas);
    }

    Coche(String marca, double kilometraje, String patente, String color, int cantRuedas, int cantPuertas){
        this.setColor(color);
        this.setPatente(patente);
        this.setKilometraje(kilometraje);
        this.setMarca(marca);
        this.setCantRuedas(cantRuedas);
        this.setCantPuertas(cantPuertas);
    }


    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


}
