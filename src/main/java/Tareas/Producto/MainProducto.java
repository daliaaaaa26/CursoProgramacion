package Tareas.Producto;

public class MainProductos {
    public static void main(String[] args) {
        Producto[] productos = {
                new Electronica("Laptop", 15000, 2),
                new Alimento("Pan", 25, "12/12/2025")
        };
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
