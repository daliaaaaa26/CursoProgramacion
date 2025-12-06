package Tareas.FiguraGeometrica;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Figura: " + nombre);
    }

    public abstract double calcularArea();
}

