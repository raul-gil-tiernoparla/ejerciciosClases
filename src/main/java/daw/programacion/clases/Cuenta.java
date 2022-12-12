package daw.programacion.clases;

public class Cuenta {

    // attr
    private String id;
    private String nombreCliente;
    private double saldo = 0;

    // constr
    public Cuenta(String id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public Cuenta(String id, String nombreCliente, double saldo) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    // meths
    public String getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [id=" + id + ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + "]";
    }

} // Cuenta
