package org.ies.tierno.ut4_orientadoaobjetos.ejemplo4;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMenuOptions option;

        do{
            MyMenuOptions.printMenu();
            System.out.println("Opción: ");
            int opt = scanner.nextInt() - 1;

            option = MyMenuOptions.fromIndex(opt);

            if (opt == 1){
                System.out.println("Has elegido: Sumar");
                //invocamos el metodo de suma
            }
            else if (opt == 2){
                System.out.println("Has elegido: Restar");
                //invocamos el metodo de resta
            }else if (opt == 3){
                System.out.println("Saliendo...");
            }

        } while (option != MyMenuOptions.Exit);
    }
}
