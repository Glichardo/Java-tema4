package org.ies.tierno.ut4_orientadoaobjetos.modificadores_acceso;

public class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    //se puede invocar al objeto desde fuera de la clase
    public void sayHello() {
        System.out.println("Hello, " + this.name + ", " + this.surname + ", " + this.course);
    }

    //no se puede invocar desde fuera
    private void saySomething(){
        System.out.println("Hello, " + this.name + ", " + this.surname + ", " + this.course);
    }

}
