package Tareas.Forma;

public class Main {
        public static void main(String[] args) {
            Forma[] formas = { new Circulo(5), new Rectangulo(4, 6) };
            for (Forma f : formas) {
                System.out.println("Área: " + f.calcularArea());
            }
        }
    }

