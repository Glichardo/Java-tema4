package org.ies.tierno.ut4_orientadoaobjetos.ejemplo3;

public class Person {

    private String name;

    private String surname;

    private int  age;

    private CivilState civilState;
    public Person(String name, String surname, int age, CivilState civilState) {
        this.name = name;
        this.surname = surname;
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

    public void printPerson(){
        System.out.println(name + " " + surname + " " + age);
    }

}
