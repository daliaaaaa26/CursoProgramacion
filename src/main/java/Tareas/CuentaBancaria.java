package Tareas;

public class CuentaBancaria {
    public static class cuentaBancaria {
        // Atributo private para encapsulamiento
        private double saldo;

        // Constructor
        public cuentaBancaria(double saldoInicial) {
            // Aseguramos que el saldo inicial sea positivo
            if (saldoInicial >= 0) {
                this.saldo = saldoInicial;
            } else {
                this.saldo = 0;
                System.out.println("Advertencia: El saldo inicial no puede ser negativo.");
            }
        }

        // Método depositar (mutador o "setter" con lógica)
        public void depositar(double cantidad) {
            if (cantidad > 0) {
                this.saldo += cantidad;
                System.out.println("Depósito de $" + cantidad + " realizado. Nuevo saldo: $" + this.saldo);
            } else {
                System.out.println("Error: La cantidad a depositar debe ser positiva.");
            }
        }

        // Método retirar (mutador o "setter" con lógica)
        public boolean retirar(double cantidad) {
            if (cantidad > 0 && this.saldo >= cantidad) {
                this.saldo -= cantidad;
                System.out.println("Retiro de $" + cantidad + " realizado. Nuevo saldo: $" + this.saldo);
                return true;
            } else if (cantidad <= 0) {
                System.out.println("Error: La cantidad a retirar debe ser positiva.");
                return false;
            } else {
                System.out.println("Error: Saldo insuficiente. Saldo actual: $" + this.saldo);
                return false;
            }
        }

        // Método getSaldo (accesor o "getter")
        public double getSaldo() {
            return this.saldo;
        }

    }
}