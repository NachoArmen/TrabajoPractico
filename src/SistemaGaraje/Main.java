package SistemaGaraje;
import Mundial.Equipo;
import Mundial.Grupo;
import Vehiculos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         // GARAJE
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


          // MUNDIAL

         // CREACION DE "GRUPOS"
         ArrayList<Equipo> grupo1 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo2 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo3 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo4 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo5 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo6 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo7 = new ArrayList<Equipo>();
         ArrayList<Equipo> grupo8 = new ArrayList<Equipo>();

        // "SORTEO" DE EQUIPOS

         //GRUPO 1
         grupo1.add(new Equipo("A"));
         grupo1.add(new Equipo("B"));
         grupo1.add(new Equipo("C"));
         grupo1.add(new Equipo("D"));

         //GRUPO 2
         grupo2.add(new Equipo("E"));
         grupo2.add(new Equipo("F"));
         grupo2.add(new Equipo("G"));
         grupo2.add(new Equipo("H"));

         //GRUPO 3
         grupo3.add(new Equipo("I"));
         grupo3.add(new Equipo("J"));
         grupo3.add(new Equipo("K"));
         grupo3.add(new Equipo("L"));

         //GRUPO 4
         grupo4.add(new Equipo("M"));
         grupo4.add(new Equipo("N"));
         grupo4.add(new Equipo("Ñ"));
         grupo4.add(new Equipo("D"));

         //GRUPO 5
         grupo5.add(new Equipo("O"));
         grupo5.add(new Equipo("P"));
         grupo5.add(new Equipo("C"));
         grupo5.add(new Equipo("D"));

         //GRUPO 6
         grupo6.add(new Equipo("Q"));
         grupo6.add(new Equipo("R"));
         grupo6.add(new Equipo("S"));
         grupo6.add(new Equipo("T"));

         //GRUPO 7
         grupo7.add(new Equipo("U"));
         grupo7.add(new Equipo("V"));
         grupo7.add(new Equipo("W"));
         grupo7.add(new Equipo("X"));

         //GRUPO 8
         grupo8.add(new Equipo("Y"));
         grupo8.add(new Equipo("Z"));
         grupo8.add(new Equipo("#"));
         grupo8.add(new Equipo("$"));


         // PARTIDOS A JUGAR
         Grupo partidosGrupo1= new Grupo();
         Grupo partidosGrupo2= new Grupo();
         Grupo partidosGrupo3= new Grupo();
         Grupo partidosGrupo4= new Grupo();
         Grupo partidosGrupo5= new Grupo();
         Grupo partidosGrupo6= new Grupo();
         Grupo partidosGrupo7= new Grupo();
         Grupo partidosGrupo8= new Grupo();

         





















    }
}
