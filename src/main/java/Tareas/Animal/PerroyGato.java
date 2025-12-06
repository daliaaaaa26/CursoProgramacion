package Tareas.Animal;

public class PerroyGato {
    public static void main(String[] args) {

        Animal[] animales = new Animal[2];

        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal a : animales) {
            a.hacerSonido();  // Polimorfismo
        }
    }
}
