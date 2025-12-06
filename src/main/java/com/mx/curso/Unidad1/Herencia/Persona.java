package com.mx.curso.Unidad1.Herencia;

public class Persona {
    /**
     * Clase Madre
     * <p>
     * variables empiezan con minusculas
     * clases Empiezan con mayuscula
     */

    public class persona {

        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}