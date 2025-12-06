package Tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {

        int anioActual = 2025;  // Año en curso
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            int anioNacimiento = sc.nextInt();

            // Calcular edad
            int edad = anioActual - anioNacimiento;
            System.out.println("Tu edad es: " + edad + " años.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número válido.");
        }
        finally {
            sc.close();
            System.out.println("Proceso finalizado.");
        }
    }
}