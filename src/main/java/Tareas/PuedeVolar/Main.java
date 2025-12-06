package Tareas;

public class Main {
    public static void main(String[] args) {

        Tareas.PuedeVolar[] voladores = new Tareas.PuedeVolar[2];

        voladores[0] = new Tareas.Avion();
        voladores[1] = new Tareas.Pajaro();

        for (Tareas.PuedeVolar p : voladores) {
            p.volar();
        }
    }
}