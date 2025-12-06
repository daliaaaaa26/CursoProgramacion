package Tareas;

import java.util.Scanner;

public class ProcesadorDeLista {
    public static void main(String[] args) {

        // -----------------------------
        // TAREA 1: IMPRIMIR ELEMENTOS DE UN ARREGLO (FOR)
        // -----------------------------
        String[] frutas = {"manzana", "banana", "pera", "uva"};

        System.out.println("Tarea 1: Lista de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }


        // -----------------------------
        // TAREA 2: BUSCAR PRIMER NOMBRE QUE EMPIECE CON 'P' (WHILE)
        // -----------------------------
        int index = 0;
        boolean encontrada = false;

        while (index < frutas.length && !encontrada) {
            if (frutas[index].startsWith("p") || frutas[index].startsWith("P")) {
                encontrada = true;
                System.out.println("\nTarea 2: Fruta encontrada → " + frutas[index] +
                        " (posición " + index + ")");
            }
            index++;
        }

        if (!encontrada) {
            System.out.println("\nTarea 2: No se encontró ninguna fruta que empiece con 'P'.");
        }


        // -----------------------------
        // TAREA 3: VALIDAR ENTRADA DEL USUARIO (DO-WHILE)
        // -----------------------------
        Scanner sc = new Scanner(System.in);
        String frutaIngresada;
        boolean esValida;

        System.out.println("\nTarea 3: Validación de fruta");

        do {
            System.out.print("Ingresa una fruta de la lista (manzana, banana, pera, uva): ");
            frutaIngresada = sc.nextLine().toLowerCase();

            esValida = false;

            // Verificamos si la fruta está en el arreglo
            for (int i = 0; i < frutas.length; i++) {
                if (frutaIngresada.equals(frutas[i])) {
                    esValida = true;
                    break;
                }
            }

            if (!esValida) {
                System.out.println("Fruta no válida. Intenta de nuevo.\n");
            }

        } while (!esValida);

        System.out.println("Correcto. '" + frutaIngresada + "' es una fruta válida.");

        sc.close();
    }
}

