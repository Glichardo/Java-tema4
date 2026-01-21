package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.taller.model;

import org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.taller.Vehicle;
import org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.taller.VehicleType;

import java.util.Scanner;

public class VehicleReader {
    private final Scanner scanner = new Scanner(System.in);

    public Vehicle read(){
        System.out.println("Introduce los datos del vehículo: ");

        System.out.println("Tipo de vehículo: ");
        String type = scanner.nextLine();

        VehicleType vehicleType = VehicleType.valueOf(type);

        System.out.println("Color: ");
        String color = scanner.nextLine();

        System.out.println("Velocidad máxima: ");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Matrícula: ");
        String license = scanner.nextLine();

        Vehicle vehicle = new Vehicle(vehicleType, maxSpeed, color, license);
        return vehicle;
    }
}
