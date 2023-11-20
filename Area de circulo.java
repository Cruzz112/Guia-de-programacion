import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);

        System.out.print("Ingese el radio del circulo");
        double radio  = scanner.nextDouble();

        double area = calcularAreaCirculo(radio);

        System.out.println("El area del circulo con radio "+ radio+"es"+area );

        scanner.close();
        
    }
}