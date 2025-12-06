package Tareas.Empleado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Cocinero());
        empleados.add(new Mesero());

        for (Empleado e : empleados) {
            e.saludar();     // Método sobrescrito → polimorfismo en acción
            e.trabajar();    // Método de la clase base
            System.out.println("--------------------");
        }
    }
}

