package org.ies.tierno.ut4_orientadoaobjetos.fechas.ejemplo1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        LocalDate fechaEspecifica = LocalDate.of(2006, 11, 8);
        System.out.println("Fecha especifica: " + fechaEspecifica);

        LocalDate fechaDesdeCadena = LocalDate.parse("2026-11-08");
        System.out.println("Fecha desde cadena: " + fechaDesdeCadena);

        int año = fechaEspecifica.getYear();
        int numeroMes = fechaEspecifica.getMonthValue();
        Month mes = fechaEspecifica.getMonth();
        int diaMes = fechaEspecifica.getDayOfMonth();
        DayOfWeek diaSemana = fechaEspecifica.getDayOfWeek();

        System.out.println("Año: " + año);
        System.out.println("Número de mes: " + numeroMes);
        System.out.println("Mes: " + mes);
        System.out.println("Día del mes: " + diaMes);
        System.out.println("Día de la semana: " + diaSemana);

        LocalDate masCincoDias = fechaEspecifica.plusDays(5);
        LocalDate menosDosMeses = fechaEspecifica.minusMonths(2);
        LocalDate masUnAño = fechaEspecifica.plusYears(1);

        System.out.println("Fecha +5 días: " + masCincoDias);
        System.out.println("Fecha -2 meses: " + menosDosMeses);
        System.out.println("Fecha +1 año: " + masUnAño);

        LocalDate otraFecha = LocalDate.of(2025, 5, 15);

        boolean esAntes = fechaEspecifica.isBefore(otraFecha);  // true si fechaEspecifica es anterior
        boolean esDespues = fechaEspecifica.isAfter(otraFecha); // true si fechaEspecifica es posterior
        boolean esIgual = fechaEspecifica.isEqual(otraFecha);   // true si son iguales

        System.out.println("Es antes de otraFecha: " + esAntes);
        System.out.println("Es después de otraFecha: " + esDespues);
        System.out.println("Es igual a otraFecha: " + esIgual);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaEspecifica.format(formatter);
        System.out.println("Fecha formateada: " + fechaFormateada);

        LocalDate fechaAnalizada = LocalDate.parse("11/03/2025", formatter);
        System.out.println("Fecha analizada desde cadena: " + fechaAnalizada);
    }
}
