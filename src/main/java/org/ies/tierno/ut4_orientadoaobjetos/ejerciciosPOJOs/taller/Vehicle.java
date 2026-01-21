package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.taller;

public class Vehicle {
    private VehicleType type;
    private int maxSpeed;
    private String color;
    private String license;

    public Vehicle(VehicleType type, int maxSpeed, String color, String license) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.license = license;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }


}
