package org.ies.tierno.ut4_orientadoaobjetos.ejemplo1;

public class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name + ", " + this.surname + ", " + this.course);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

