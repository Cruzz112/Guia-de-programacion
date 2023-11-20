import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Por favor, ingrese su información de contacto");

        System.out.print("Nombre completo ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Edad ");
        int edad = scanner.nextInt();
        scanner.nextLine();

         System.out.print("Correo electrónico ");
        String correoElectronico = scanner.nextLine();

        System.out.print("Teléfono ");
        String telefono = scanner.nextLine();

         scanner.close();
        System.out.println("\nInformación de contacto ingresada");
        System.out.println("Nombre completo " + nombreCompleto);
        System.out.println("Edad " + edad);
        System.out.println("Correo electrónico " + correoElectronico);
        System.out.println("Teléfono " + telefono);
    }
}