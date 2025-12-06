package Tareas;

public class empleado {
        private int id;
        private double salario;

        public empleado(int id, double salario) {
            this.id = id;
            this.salario = salario;
        }

        public void aumentarSalario(double porcentaje) {
            salario += salario * (porcentaje / 100);
        }

        public double getSalario() {
            return salario;
        }

        public static void main(String[] args) {
            empleado e1 = new empleado(101, 5000);
            e1.aumentarSalario(10);
            System.out.println("Salario actualizado: " + e1.getSalario());
        }
    }

