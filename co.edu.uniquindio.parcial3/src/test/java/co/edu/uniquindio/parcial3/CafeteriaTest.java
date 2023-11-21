package co.edu.uniquindio.parcial3;
import static org.junit.jupiter.api.Assertions.*;

import co.edu.uniquindio.parcial3.model.Cafeteria;
import org.junit.jupiter.api.Test;
public class CafeteriaTest {
    @Test
    void verificarNombre(){
        String esperado = "Caffe";
        String real = cafeteria.getNombre();
        assertEquals(esperado, real);
    }
}
