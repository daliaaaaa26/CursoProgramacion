package unidad3.Practica03;

public class CalculadoraGeometrica {
    private String nombreFigura;
    public static double pi = 3.14159;

    public CalculadoraGeometrica() {
        this.nombreFigura = "Desconocida";
    }

    public CalculadoraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    //sobrecarga de metodos
    public double CalcularArea(double radio) {
        return pi * radio * radio;
    }

    public double CalcularArea(double ancho, double alto){
        return ancho * alto;
    }

    public double CalcularArea(double base, int alto) {
        return(base *alto)/2;
    }

    static void main(String[] args) {
        CalculadoraGeometrica cal1
                =new CalculadoraGeometrica("principal");
        System.out.println("Area del circulo" +
                cal1.CalcularArea(5));
        System.out.println("Area del rectangulo" +
                cal1.CalcularArea(4, 6));
        System.out.println("Area del triangulo" +
                cal1.CalcularArea(4, 6));


    }

}

