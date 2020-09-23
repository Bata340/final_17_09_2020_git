package CargasTest;

import Cargas.Helatodo;
import Vehiculos.Auto;
import Vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelatodoTest {

    @Test
    public void test01DadoUnAutoCargoUnaHelatodoYSeCarga(){
        Auto auto = new Auto();
        Helatodo helatodo = new Helatodo();
        auto.cargar(helatodo);
        assertEquals(auto.descargar(), helatodo);
    }

    @Test
    public void test02DadaUnaMotoCargoUnaHelatodoYSeCarga(){
        Moto moto = new Moto();
        Helatodo helatodo = new Helatodo();
        moto.cargar(helatodo);
        assertEquals(moto.descargar(), helatodo);
    }
}
