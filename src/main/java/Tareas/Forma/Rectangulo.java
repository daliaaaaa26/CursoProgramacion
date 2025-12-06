package Tareas.Forma;

public class Rectangulo extends Forma {
        double ancho, alto;
        public Rectangulo(double ancho, double alto) {
            super();
            this.ancho = ancho; this.alto = alto; }
        @Override
        public double calcularArea() { return ancho * alto; }
    }

