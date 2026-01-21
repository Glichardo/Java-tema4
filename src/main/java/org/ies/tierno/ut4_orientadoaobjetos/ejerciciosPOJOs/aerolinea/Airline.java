package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.aerolinea;

public class Airline {
    private String name;
    private Flight[] flight;

    public Airline(String name, Flight[] flight) {
        this.name = name;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flight[] getFlight() {
        return flight;
    }

    public void setFlight(Flight[] flight) {
        this.flight = flight;
    }
}
