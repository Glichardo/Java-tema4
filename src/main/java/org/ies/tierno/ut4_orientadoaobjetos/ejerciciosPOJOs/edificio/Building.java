package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.edificio;

public class Building {
    private String address;
    private String locality;
    private Apartment[] apartment;

    public Building(String address, String locality, Apartment[] apartment) {
        this.address = address;
        this.locality = locality;
        this.apartment = apartment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Apartment[] getApartment() {
        return apartment;
    }

    public void setApartment(Apartment[] apartment) {
        this.apartment = apartment;
    }
}
