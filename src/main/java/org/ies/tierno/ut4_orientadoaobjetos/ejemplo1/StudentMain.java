package org.ies.tierno.ut4_orientadoaobjetos.ejemplo1;

public class StudentMain {
    public static void main(String[] args) {
        Student mortadelo = new Student("mortadelo", "autista", 1);
        Student filemon = new Student("filemon", "panchito", 2);

        mortadelo.sayHello();
        filemon.sayHello();

    }
}
