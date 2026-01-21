package org.ies.tierno.ut4_orientadoaobjetos.comparar_objetos;

public class StudentObject {
    public static void main(String[] args) {
        Student pablo1 = new Student("pablo", "motos", 45);
        Student pablo2 = new Student("pablo", "motos", 45);
        Student pedro = new Student("pedro", "sanchez", 54);

        if(pablo1 == pablo2) {
            //no se ejecuta, pablo1 y pablo2 son instancias distintas
            System.out.println("pablo1 == pablo2");
        }

        if(pablo1.equals(pablo2)) {
            //este si se ejecuta porque el metodo equals pues eso, en fin, que si se ejecuta
            System.out.println("pablo1.equals(pablo2)");
        }

        if (pablo1.equals(pedro)) {
            //no se ejecuta porque pablo y pedro son distintos
            System.out.println("pablo1.equals(pedro)");
        }


    }
}
