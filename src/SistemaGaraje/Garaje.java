package SistemaGaraje;
import Vehiculos.Vehiculo;
import java.util.Date;
import java.util.ArrayList;

public class Garaje {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidadMaxima;
    private int capacidadActual;
    private double precioRueda;
    private Date horaApertura;



    Garaje(Date horaApertura){
        this.setHoraApertura(horaApertura);
    }
    Garaje(Date horaApertura, int capacidadMaxima){
        this.setHoraApertura(horaApertura);
        this.setCapacidadMaxima(capacidadMaxima);
    }
    Garaje(Date horaApertura,int capacidadMaxima, int capacidadActual){
        this.setHoraApertura(horaApertura);
        this.setCapacidadMaxima(capacidadMaxima);
        this.setCapacidadActual(capacidadActual);
    }

    Garaje(Date horaApertura,int capacidadMaxima, int capacidadActual, double precioRueda){
        this.setHoraApertura(horaApertura);
        this.setCapacidadMaxima(capacidadMaxima);
        this.setCapacidadActual(capacidadActual);
        this.setPrecioRueda(precioRueda);
    }






    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }

    public Date getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Date horaApertura) {
        this.horaApertura = horaApertura;
    }
}
