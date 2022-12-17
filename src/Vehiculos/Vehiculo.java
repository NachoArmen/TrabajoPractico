package Vehiculos;

public class Vehiculo {
    private String marca;
    private double kilometraje;
    private String patente;
    private String color;


    Vehiculo(){

    }
     Vehiculo(String marca, double kilometraje, String patente, String color){
        this.setColor(color);
        this.setPatente(patente);
        this.setKilometraje(kilometraje);
        this.setMarca(marca);
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
