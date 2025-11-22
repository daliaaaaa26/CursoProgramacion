package com.mx.curso.unidad2.excepciones;

public class ConversionObjetos {
    public static void main(String[] args) {
        Object object = "UX";
        try {
            Integer numero = (Integer) object;
        } catch (ClassCastException e) {
            System.out.println("No es posible covertir un tipo" +
                    "de objeto al tipo deseado: " + e.getMessage());
        }
    }

}
