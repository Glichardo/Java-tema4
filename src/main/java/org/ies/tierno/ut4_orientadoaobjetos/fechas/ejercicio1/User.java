package org.ies.tierno.ut4_orientadoaobjetos.fechas.ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private String dni;
    private LocalDate birthDate;

    public User(String name, String surname, String dni, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.birthDate = birthDate;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(dni, user.dni) && Objects.equals(birthDate, user.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dni, birthDate);
    }
}
