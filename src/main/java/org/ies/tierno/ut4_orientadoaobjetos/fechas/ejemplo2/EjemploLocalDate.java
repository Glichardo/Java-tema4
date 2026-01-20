package org.ies.tierno.ut4_orientadoaobjetos.fechas.ejemplo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDate {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2026, 7, 4);
        System.out.println("Fecha original: " + fecha);

        //sumar 10 dias:
        LocalDate nuevaFecha = fecha.plusDays(10);
        System.out.println("Fecha final: " + nuevaFecha);

        //formatear nueva fecha:
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = nuevaFecha.format(formatter);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }
}
