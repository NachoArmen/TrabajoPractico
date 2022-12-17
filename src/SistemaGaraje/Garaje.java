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


    Garaje(){

    }

    Garaje(Date horaApertura,int capacidadMaxima, int capacidadActual, double precioRueda){
        this.setHoraApertura(horaApertura);
        this.setCapacidadMaxima(capacidadMaxima);
        this.setCapacidadActual(capacidadActual);
        this.setPrecioRueda(precioRueda);
        this.vehiculos= new ArrayList<Vehiculo>();
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

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
