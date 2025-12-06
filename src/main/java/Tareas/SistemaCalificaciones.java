package Tareas;
public class SistemaCalificaciones {
    public static void main(String[] args) {
        // 2. Declarar la variable notaExamen
        int notaExamen = 95; // Puedes cambiar este valor para probar diferentes casos

        // 6. Validar que la nota esté en el rango correcto
        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("La nota es inválida");
        } else {
            // 3. Sentencia if-else para aprobar o no
            if (notaExamen >= 60) {
                System.out.println("¡Felicidades, has aprobado!");

                // 4. If anidado para desempeño excelente
                if (notaExamen >= 90) {
                    System.out.println("¡Excelente desempeño!");
                }
            } else {
                System.out.println("Lo sentimos, no has aprobado.");
            }

            // 5. Sentencia switch para calificación literal
            char calificacion;
            switch (notaExamen / 10) {
                case 10: // Para el 100
                case 9:
                    calificacion = 'A';
                    break;
                case 8:
                    calificacion = 'B';
                    break;
                case 7:
                    calificacion = 'C';
                    break;
                case 6:
                    calificacion = 'D';
                    break;
                default:
                    calificacion = 'F';
                    break;
            }
            System.out.println("Tu calificación es: " + calificacion);
        }
    }
}

