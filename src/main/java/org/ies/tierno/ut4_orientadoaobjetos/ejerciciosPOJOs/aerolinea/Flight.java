package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.aerolinea;

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String door;
    private Passenger[] passenger;

    public Flight(int flightNumber, String origin, String destination, String door, Passenger[] passenger) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.door = door;
        this.passenger = passenger;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Passenger[] getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger[] passenger) {
        this.passenger = passenger;
    }
}
