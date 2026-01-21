package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.edificio;

public class Apartment {
    private int floor;
    private String door;
    private Owner[] owner;

    public Apartment(int floor, String door, Owner[] owner) {
        this.floor = floor;
        this.door = door;
        this.owner = owner;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwner() {
        return owner;
    }

    public void setOwner(Owner[] owner) {
        this.owner = owner;
    }
}
