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

    public double credito(double cantidad) {
        this.saldo -= cantidad;
        return this.saldo;
    }

    public double debito(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("El saldo es insuficiente.");
        }
        return this.saldo;
    }

    public double transferencia(Cuenta c, double cantidad) {
        if (cantidad <= this.saldo) {
            c.saldo += cantidad;
            this.saldo -= cantidad;
        } else {
            System.out.println("El saldo es insuficiente.");
        }
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [id=" + this.id + ", nombreCliente=" + this.nombreCliente + ", saldo=" + this.saldo + "]";
    }

} // Cuenta
