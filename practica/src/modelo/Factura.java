package modelo;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioPorArticulo(precioPorArticulo);
    }

    public String getNumeroPieza() { return numeroPieza; }
    public void setNumeroPieza(String numeroPieza) { this.numeroPieza = numeroPieza; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
    }

    public double getPrecioPorArticulo() { return precioPorArticulo; }
    public void setPrecioPorArticulo(double precio) {
        this.precioPorArticulo = (precio > 0.0) ? precio : 0.0;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }

    @Override
    public String toString() {
        return "=== FACTURA ===\n" +
                "Número de pieza : " + numeroPieza + "\n" +
                "Descripción     : " + descripcion + "\n" +
                "Cantidad        : " + cantidad + "\n" +
                "Precio unitario : $" + String.format("%.2f", precioPorArticulo) + "\n" +
                "Monto total     : $" + String.format("%.2f", obtenerMontoFactura());
    }
}