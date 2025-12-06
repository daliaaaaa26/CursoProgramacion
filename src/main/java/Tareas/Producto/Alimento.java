package Tareas.Producto;

public class Alimento extends Producto {
    String fechaDeCaducidad;
    public Alimento(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento: " + nombre + ", Precio: " + precio + ", Caducidad: " + fechaDeCaducidad);
    }
}
