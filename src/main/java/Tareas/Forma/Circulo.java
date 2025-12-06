package Tareas.Forma;

public class Circulo extends Forma {
        double radio;
    public Circulo(double radio) {
        super();
        this.radio = radio; }
        @Override
        public double calcularArea() { return Math.PI * radio * radio; }
    }

