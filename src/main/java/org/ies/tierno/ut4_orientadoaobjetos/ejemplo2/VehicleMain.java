package org.ies.tierno.ut4_orientadoaobjetos.ejemplo2;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Moto", "Azul", 180, "2385JLW");
        Vehicle vehicle2 = new Vehicle("Camión", "Rojo", 90, "0654LRM");

        vehicle1.info();
        vehicle2.info();

    }
}
