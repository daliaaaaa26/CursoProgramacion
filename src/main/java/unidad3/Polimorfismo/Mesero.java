package unidad3.Polimorfismo;

public class Mesero extends Empleado {

    @Override
    public double calcularSalario() {
        return 3500*4;
    }
}