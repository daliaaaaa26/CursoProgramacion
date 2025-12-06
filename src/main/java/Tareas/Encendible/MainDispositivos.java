package Tareas.Encendible;

public class MainDispositivos {
    public static void main(String[] args) {
        Encendible[] dispositivos = { new TV(), new Bombilla() };
        for (Encendible d : dispositivos) {
            d.encender();
            d.apagar();
        }
    }
}
