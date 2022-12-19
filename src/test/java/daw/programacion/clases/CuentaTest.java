package daw.programacion.clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    Cuenta cuenta1;

    @BeforeEach
    void crearClaseCuenta1(){
        String id = "Cd45gt";
        String nombreCliente = "Ana Botín";
        cuenta1 = new Cuenta(id,nombreCliente);
    }

    @AfterEach
    void borrarClaseCuenta1(){
        cuenta1 = null;
    }

    
    
}
