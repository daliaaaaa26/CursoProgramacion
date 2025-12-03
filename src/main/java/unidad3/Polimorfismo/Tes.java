package unidad3.Polimorfismo;

import java.util.List;

public class Tes {
    static void main(String[] args) {
        List<Empleado> empleado = List.of(new Cocinero(), new Mesero(), new Gerente());
        /**
         * Creamos un ciclo que itero la Lista de empleados
         * e imprimo el metodo correspondiente CalcularSalario
          */
        for(Empleado e : empleado){
            System.out.println("Salario minimo: " + e.calcularSalario());
        }
    }
}
