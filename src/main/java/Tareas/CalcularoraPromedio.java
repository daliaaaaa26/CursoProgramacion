package Tareas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularoraPromedio {
    public static void main(String[] args) {

        double nota1 = 0;
        double nota2 = 0;
        Scanner sc = new Scanner(System.in);

        try {
            // Solicitar la primera nota
            System.out.print("Ingresa la primera nota: ");
            nota1 = sc.nextDouble();

            // Solicitar la segunda nota
            System.out.print("Ingresa la segunda nota: ");
            nota2 = sc.nextDouble();

            // Calcular promedio
            double promedio = (nota1 + nota2) / 2;

            System.out.println("El promedio de las dos notas es: " + promedio);

        }
        catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar solo números. Inténtalo nuevamente.");
        }
        finally {
            sc.close();
            System.out.println("Proceso finalizado.");
        }
        }
}
