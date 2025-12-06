package Tareas.FiguraGeometrica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));        // radio = 5
        figuras.add(new Rectangulo(4, 6));  // base = 4, altura = 6

        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("---------------------");
        }
    }
}

