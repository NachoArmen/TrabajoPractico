package Vehiculos;

public class Moto extends Vehiculo {
    private String cilindrada;



    Moto(){

    }

    Moto(String cilindrada){
        this.setCilindrada(cilindrada);
    }

   public Moto(String cilindrada,String marca, String patente, String color, double kilometraje, int cantRuedas){
        this.setCilindrada(cilindrada);
        this.setMarca(marca);
        this.setKilometraje(kilometraje);
        this.setPatente(patente);
        this.setColor(color);
        this.setCantRuedas(cantRuedas);
    }


    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

}
