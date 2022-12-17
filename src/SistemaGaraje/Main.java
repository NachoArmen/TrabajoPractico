package SistemaGaraje;
import Vehiculos.*;
import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
         Garaje GarajePrincipal= new Garaje(8,4);
         Coche vwGol= new Coche("volkswagen",300,"LLP271","gris",3);
         Coche audiA5= new Coche("audi",150,"AD179CB","negro",5);
         Coche bmwX8= new Coche("bmw", 2000, "IUF834", "blanco", 5);
         Moto suzukiR9= new Moto("100cc", "Suzuki", "ABC123","verde", 2500,2);
         Moto kawasakiNinja= new Moto("500cc", "Kawasaki", "XYZ789","rojo", 6000,2);
    }
}
