package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.aerolinea;

public class Passenger {
    private String nif;
    private String name;
    private String surname;
    private String seat;

    public Passenger(String nif, String name, String surname, String seat) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seat = seat;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
