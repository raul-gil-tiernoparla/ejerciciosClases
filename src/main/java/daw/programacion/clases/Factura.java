package daw.programacion.clases;

public class Factura {

    // atr
    private String id;
    private String desc;
    private int cantidad;
    private double precioUnitario;

    // constr
    public Factura(String id, String desc, int cantidad, double precioUnitario) {
        this.id = id;
        this.desc = desc;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    // metods
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", desc=" + desc + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
                + "]";
    }

    

} // Factura
