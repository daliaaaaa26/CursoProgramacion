package Tareas.Clase;

public class MainClase {
    public static void main(String[] args) {
        Clase clase = new Clase("POO");
        clase.agregarEstudiante(new Estudiante("Ana", 1));
        clase.agregarEstudiante(new Estudiante("Luis", 2));
        clase.mostrarEstudiantes();
    }
}