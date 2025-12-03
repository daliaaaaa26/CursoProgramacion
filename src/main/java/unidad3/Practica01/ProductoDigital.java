package unidad3.Practica01;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private boolean esDescargable;
    private static int contadorProducto=0;

    public ProductoDigital (String nombre, double precio, boolean esDescargable){
        this.nombre = nombre;
        this.precio = precio;
        this.esDescargable = esDescargable;
        contadorProducto++;
    }

    //obtener el valor de los productos
    public int ObtenerTotalProductos(){
        return contadorProducto;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsDescargable() {
        return esDescargable;
    }

    public void setEsDescargable(boolean esDescargable) {
        this.esDescargable = esDescargable;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public static void setContadorProducto(int contadorProducto) {
        ProductoDigital.contadorProducto = contadorProducto;
    }
}

