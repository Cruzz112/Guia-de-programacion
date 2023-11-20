import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) 
        Scanner scanner = new Scanner (System.in);
        int opcion ;
        
    do {
    System.out.println("Menu de Taqueria");
    System.out.println("1_ Tacos al pastor");
    System.out.println("2_ Tacos de bistec");
    System.out.println("3_ Gringas");
    System.out.println("4_ Salir");
    System.out.println("Elige una opcion para salir");

    opcion = scanner.nextInt();

    switch (opcion) {
        case 1:
            System.out.println ("Disfruta los tacos al pastor");
            break;

        case 2:
            System.out.println ("Disfruta los tcos de bistec");
            break;

        case 3:
            System.out.println ("Disfruta la gringa");
            break;

        case 4:
            System.out.println ("Saliendo del menu");
            break;

            System.out.println ("Opcion no valida");
    }
    
} while (opcion = 4);
scanner.close();
}
