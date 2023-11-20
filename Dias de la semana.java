import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Ingresa un número del 1 al 7 para decir un día de la semana: ");
        int numeroDia = scanner.nextInt();

        String mensajeSaludo = obtenerMensajeSaludo(numeroDia);
        System.out.println(mensajeSaludo);

        scanner.close();

        private static String obtenerMensajeSaludo(int numeroDia) {
        String mensajeSaludo;

        switch (numeroDia) {
            case 1:
                mensajeSaludo = "Hola, soy el día Domingo.";
                break;
            case 2:
                mensajeSaludo = "Hola, soy el día Lunes.";
                break;
            case 3:
                mensajeSaludo = "Hola, soy el día Martes.";
                break;
            case 4:
                mensajeSaludo = "Hola, soy el día Miércoles.";
                break;
            case 5:
                mensajeSaludo = "Hola, soy el día Jueves.";
                break;
            case 6:
                mensajeSaludo = "Hola, soy el día Viernes.";
                break;
            case 7:
                mensajeSaludo = "Hola, soy el día Sábado.";
                break;
            default:
                mensajeSaludo = "Número válido. Debes poner un número del 1 al 7.";
                break;

                return mensajeSaludo;
    }
}