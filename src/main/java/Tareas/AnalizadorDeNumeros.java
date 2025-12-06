package Tareas;


import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {

        // -----------------------------
        // TAREA 1: SUMA DEL 1 AL 100 (FOR)
        // -----------------------------
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("Tarea 1: La suma del 1 al 100 es: " + suma);


        // -----------------------------
        // TAREA 2: PRIMER NÚMERO MAYOR A 50 (WHILE)
        // -----------------------------
        int num = 1;

        while (num <= 50) {
            num++;
        }

        System.out.println("Tarea 2: El primer número mayor a 50 es: " + num);


        // -----------------------------
        // TAREA 3: VALIDAR CONTRASEÑA (DO-WHILE)
        // -----------------------------
        Scanner sc = new Scanner(System.in);

        String contraseñaCorrecta = "1234";
        String entradaUsuario;
        boolean esCorrecta = false;

        do {
            System.out.print("Tarea 3: Ingresa la contraseña: ");
            entradaUsuario = sc.nextLine();

            if (entradaUsuario.equals(contraseñaCorrecta)) {
                esCorrecta = true;
                System.out.println("Contraseña correcta. Acceso permitido.");
            } else {
                System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            }

        } while (!esCorrecta);

        sc.close();
    }
}

