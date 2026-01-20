package org.ies.tierno.ut4_orientadoaobjetos.ejercicios_enumeraciones.ej1;

import java.util.Scanner;

public class PersonObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("Pablo", "Motos", "02555973F", 45, CivilState.Single);
        Person person2 = new Person("El", "Cigala", "45898376R", 57, CivilState.Divorced);

        person1.sayHello();
        person1.sayGoodbye();
        person2.sayHello();
        person2.sayGoodbye();
    }
}
