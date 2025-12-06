package Tareas.Personaje;

public class MainJuego {
    public static void main(String[] args) {
        Personaje g = new Guerrero();
        Personaje m = new Mago();
        g.atacar();
        m.atacar();
    }
}
