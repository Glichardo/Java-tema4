package org.ies.tierno.ut4_orientadoaobjetos.ejemplo2;

import java.util.Objects;

public class Vehicle {
    private String vehicleType;
    private String color;
    private int maxSpeed;
    private String plate;

    public Vehicle(String vehicleType, String color, int maxSpeed, String plate) {
        this.vehicleType = vehicleType;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.plate = plate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return maxSpeed == vehicle.maxSpeed && Objects.equals(vehicleType, vehicle.vehicleType) && Objects.equals(color, vehicle.color) && Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleType, color, maxSpeed, plate);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", plate='" + plate + '\'' +
                '}';
    }

    public void info(){
        System.out.println(this.toString());
    }
}
