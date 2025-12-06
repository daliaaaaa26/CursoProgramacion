package Tareas.Vehiculo;

public abstract class Vehiculo {
    public abstract void acelerar();

    class vehiculo {
        int velocidad;
        int numLlantas;

        public void acelerar() {
            velocidad += 5;
            System.out.println("Velocidad: " + velocidad);
        }
    }
}
