package Tareas.Producto;

public class Electronica extends Producto {
    int garantia;
    public Electronica(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónica: " + nombre + ", Precio: " + precio + ", Garantía: " + garantia + " años");
    }
}
