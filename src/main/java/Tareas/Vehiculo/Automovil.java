package Tareas.Vehiculo;

public class Automovil extends Vehiculo {
        public Automovil() {
            int numLlantas = 4;
        }

        @Override
        public void acelerar() {
            int velocidad = 20;
            System.out.println("Velocidad rápida: " + velocidad);
        }
    }

