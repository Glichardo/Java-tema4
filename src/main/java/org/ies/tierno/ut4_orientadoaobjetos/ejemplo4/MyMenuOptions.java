package org.ies.tierno.ut4_orientadoaobjetos.ejemplo4;

public enum MyMenuOptions {

    Sum("Sumar"), Substract("Restar"), Exit("Salir");

    private final String description;

    MyMenuOptions(String description) {
        this.description = description;
    }

    public static MyMenuOptions fromIndex(int opt){
        return MyMenuOptions.values()[opt];
    }

    public static void printMenu(){
        System.out.println("Elige una opción");
        for (int i = 0; i < MyMenuOptions.values().length; i++) {
            System.out.println((i + 1) + "." + MyMenuOptions.values()[i].description);
        }
    }

}
