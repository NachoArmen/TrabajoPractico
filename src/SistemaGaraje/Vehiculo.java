package SistemaGaraje;

public class Vehiculo {
    private String marca;
    private double kilometraje;
    private String patente;
    private String color;

    private int cantRuedas;


    Vehiculo(){

    }
     Vehiculo(String marca, double kilometraje, String patente, String color, int cantRuedas){
        this.setColor(color);
        this.setPatente(patente);
        this.setKilometraje(kilometraje);
        this.setMarca(marca);
        this.setCantRuedas(cantRuedas);
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

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
