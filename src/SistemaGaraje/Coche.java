package SistemaGaraje;

public class Coche extends Vehiculo {
    private int cantPuertas;





    public Coche(String marca, double kilometraje, String patente, String color, int cantPuertas){
        this.setColor(color);
        this.setPatente(patente);
        this.setKilometraje(kilometraje);
        this.setMarca(marca);
        this.setCantPuertas(cantPuertas);
    }


    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


}
