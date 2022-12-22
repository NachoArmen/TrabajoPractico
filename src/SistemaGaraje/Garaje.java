package SistemaGaraje;

import java.util.ArrayList;

public class Garaje {
    private ArrayList<Vehiculo> vehiculos;
    private int capacidadMaxima;
    private int capacidadActual;
    private double precioRueda;
    private int horaApertura;
    private boolean maximoAlcanzado;




    Garaje(){

    }
    public Garaje(int horaApertura, int capacidadMaxima){
        this.setHoraApertura(horaApertura);
        this.setCapacidadMaxima(capacidadMaxima);
        this.vehiculos= new ArrayList<Vehiculo>();
    }

    public Garaje(int horaApertura,int capacidadMaxima, int capacidadActual, double precioRueda){
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



    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    //REMOVE vehiculos DE ARRAY VEHICULOS.

    public void SacarVehiculo(Vehiculo vehiculos){
        this.vehiculos.remove(vehiculos);
    }

    public boolean isMaximoAlcanzado() {
        return maximoAlcanzado;
    }

    public void setMaximoAlcanzado(boolean maximoAlcanzado) {
        this.maximoAlcanzado = false;
    }

    // BOOLEAN PARA CAPACIDAD MAXIMA
    public boolean topeMaximo(){
        return this.vehiculos.size()>=capacidadMaxima;
    }

    // AGREGO VEHICULO SI NO SE CUMPLE LA CONDICION ANTERIOR
    public void addVehiculo(Vehiculo vehiculo){
        if (topeMaximo()) {
            this.vehiculos.add(vehiculo);
        }
    }

    // PROMEDIO DE KM TOTAL

    public double promedioKilometraje(){
        double sumaKilometraje=0;
        for (int i=0; i<this.vehiculos.size(); i++){
            sumaKilometraje=sumaKilometraje + this.vehiculos.get(i).getKilometraje();
        }
        return sumaKilometraje/vehiculos.size();
    }



    // PRECIO DE LAS RUEDAS

    public  double precioTotalRuedas(){
        double sumaTotalRuedas= 0;

        for (int i=0; i< vehiculos.size(); i++){
            sumaTotalRuedas=sumaTotalRuedas + this.vehiculos.get(i).getCantRuedas();
        }
        return sumaTotalRuedas * precioRueda;
    }


    public int getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(int horaApertura) {
        this.horaApertura = horaApertura;
    }


}
