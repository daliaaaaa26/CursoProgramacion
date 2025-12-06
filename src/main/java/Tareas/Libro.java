package Tareas;

public class Libro {
    // Atributos
    String titulo;
    String autor;
    int paginas;

    // Constructor (opcional, pero útil para inicializar objetos)
    public void Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para mostrar la información
    public void mostrarInfo() {
        System.out.println("--- Detalles del Libro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("--------------------------");
    }

}

