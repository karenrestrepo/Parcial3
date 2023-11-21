package co.edu.uniquindio.parcial3;
import static org.junit.jupiter.api.Assertions.*;

import co.edu.uniquindio.parcial3.dto.CafeteriaDto;
import co.edu.uniquindio.parcial3.model.Cafeteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CafeteriaTest {
    CafeteriaDto cafeteriaDto;

    @BeforeEach
    void init(){
        cafeteriaDto = new CafeteriaDto("Coffe");
    }

    @Test
    void verificarNombre(){
        String esperado = "Caffe";
        String real = cafeteriaDto.nombre();
        assertEquals(esperado, real);
    }
}
