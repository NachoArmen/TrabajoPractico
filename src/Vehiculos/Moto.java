package Vehiculos;

public class Moto extends Vehiculo {
    private String cilindrada;



    Moto(){

    }

    Moto(String cilindrada){
        this.setCilindrada(cilindrada);
    }

    Moto(String cilindrada,String marca, String patente, String color, double kilometraje){
        this.setCilindrada(cilindrada);
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
    
}
