package SistemaGaraje;
import Vehiculos.*;

public class Main {
    public static void main(String[] args) {
         Garaje garajePrincipal= new Garaje(8,4);
         Coche vwGol= new Coche("volkswagen",300,"LLP271","gris",3);
         Coche audiA5= new Coche("audi",150,"AD179CB","negro",5);
         Coche bmwX8= new Coche("bmw", 2000, "IUF834", "blanco", 5);
         Moto suzukiR9= new Moto("100cc", "Suzuki", "ABC123","verde", 2500,2);
         Moto kawasakiNinja= new Moto("500cc", "Kawasaki", "XYZ789","rojo", 6000,2);


         garajePrincipal.addVehiculo(audiA5);
         garajePrincipal.addVehiculo(bmwX8);
         garajePrincipal.addVehiculo(vwGol);
         garajePrincipal.addVehiculo(kawasakiNinja);

         System.out.println(String.format("¿Esta completo?: %b \n Capacidad actual: %s \n Promedio de Kilometraje: %f \n Precio total de las ruedas: %f", garajePrincipal.topeMaximo(),garajePrincipal.getVehiculos().size(),garajePrincipal.promedioKilometraje(),garajePrincipal.precioTotalRuedas()));































    }
}
