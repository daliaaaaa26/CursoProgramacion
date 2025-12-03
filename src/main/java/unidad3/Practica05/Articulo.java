package unidad3.Practica05;

public class Articulo {
    private String codigo;
    private int cantidadStok;
    private double precioUnitario;

    public Articulo() {
        this.codigo = codigo;
        this.cantidadStok = 0;
        this.precioUnitario = 1.0;
    }

    public Articulo(String codigo, double precioUnitario, int cantidadStok) {
        this.codigo = codigo;
        this.cantidadStok = cantidadStok;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadStok() {
        return cantidadStok;
    }

    public int setCantidadStok() {
        this.cantidadStok = cantidadStok;
    }
}



