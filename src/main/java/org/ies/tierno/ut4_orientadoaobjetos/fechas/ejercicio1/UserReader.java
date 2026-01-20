package org.ies.tierno.ut4_orientadoaobjetos.fechas.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserReader {

    private Scanner scanner;
    private DateTimeFormatter formatter;

    public UserReader(Scanner scanner) {
        this.scanner = scanner;
        this.formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public User readUser() {
        System.out.println("Nombre: ");
        String name = scanner.nextLine();
        System.out.println("Apellidos: ");
        String surname = scanner.nextLine();
        System.out.println("DNI: ");
        String dni = scanner.nextLine();
        System.out.println("Fecha de nacimiento: ");
        String dateString = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(dateString, formatter);
        return new User(name, surname, dni, birthDate);
    }
}
