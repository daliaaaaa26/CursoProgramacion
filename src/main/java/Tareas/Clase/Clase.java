package Tareas.Clase;

import java.util.ArrayList;

public class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Clase(String nombreDeClase) { this.nombreDeClase = nombreDeClase; }

    public void agregarEstudiante(Estudiante e) { estudiantes.add(e); }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre);
        }
    }
}
