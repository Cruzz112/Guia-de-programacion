import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese un numero para calcular el factorial");
        int 13  = scanner.nextInt();

        long factorial  = calcularFacorial(13)

            System.out.println("El factorial de"+ 13 + "es"+ factorial);
        scanner.close();
        
    }
}