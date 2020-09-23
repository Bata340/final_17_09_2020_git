package CargasTest;

import Cargas.Bici;
import Excepciones.CargaNoEsCargableException;
import Vehiculos.Auto;
import Vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BiciTest {

    @Test
    public void test01DadaUnaMotoIntentoCargarUnaBiciYLanzaExcepcion(){
        Moto moto = new Moto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, () -> moto.cargar(bici));
    }

    @Test
    public void test02DadoUnAutoSinPortaBiciIntentoCargarUnaBiciYLanzaExcepcion(){
        Auto auto = new Auto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, () -> auto.cargar(bici));
    }

    @Test
    public void test03DadoUnAutoConPortaBiciCargoUnaBiciYSeCarga(){
        Auto auto = new Auto();
        Bici bici = new Bici();
        auto.agregarPortaBici();
        auto.cargar(bici);
        assertEquals(auto.descargar(), bici);
    }
}
