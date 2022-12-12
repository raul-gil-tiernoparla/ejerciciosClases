package daw.programacion.clases;


public class EjerciciosClases {
    public static void main(String[] args) {

        String id = "advsdwfevwfavrwvwr";
        String nombre = "Pepe";
        double saldo = 100;

        Cuenta pepe = new Cuenta(id, nombre, saldo);

        double cantidad = 200;
        pepe.credito(cantidad); // sin problema
        System.out.println(pepe);

        pepe.credito(-cantidad);

        pepe.debito(cantidad); // quejarse

        cantidad = 50;
        pepe.debito(cantidad); // sin problemas
        System.out.println(pepe);



    } // main
} // EjerciciosClases
