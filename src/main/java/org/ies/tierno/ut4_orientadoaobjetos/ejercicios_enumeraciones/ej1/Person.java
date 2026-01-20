package org.ies.tierno.ut4_orientadoaobjetos.ejercicios_enumeraciones.ej1;

public class Person {
    private String name;
    private String surname;
    private String dni;
    private int age;
    private CivilState civilState;

    public Person(String name, String surname, String dni, int age, CivilState civilState) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.age = age;
        this.civilState = civilState;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CivilState getCivilState() {
        return civilState;
    }

    public void setCivilState(CivilState civilState) {
        this.civilState = civilState;
    }

    public void sayHello() {
        System.out.println("Hola, soy " + this.name + " " + this.surname + ", con DNI " + this.dni + ", tengo " + this.age + " años y mi estado civil es " + civilState.getDescription());
    }

    public void sayGoodbye(){
        System.out.println("Adios. Firmado: " + name);
    }

}
