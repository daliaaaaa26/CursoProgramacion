package Tareas;

public class Calculadora {
        public int sumar(int a, int b) { return a + b; }
        public int sumar(int a, int b, int c) { return a + b + c; }
        public double sumar(double a, double b) { return a + b; }

        public static void main(String[] args) {
            Calculadora calc = new Calculadora();
            System.out.println(calc.sumar(2, 3));
            System.out.println(calc.sumar(2, 3, 4));
            System.out.println(calc.sumar(2.5, 3.7));
        }
    }

