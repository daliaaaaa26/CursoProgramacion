package Tareas;

public class Avion implements Tareas.PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El avión enciende sus motores y despega.");
    }
}
