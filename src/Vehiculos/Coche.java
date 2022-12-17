package Vehiculos;

public class Coche extends Vehiculo {
    private int cantPuertas;


    Coche(){

    }

    Coche(int cantPuertas){
        this.setCantPuertas(cantPuertas);
    }


    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


}
