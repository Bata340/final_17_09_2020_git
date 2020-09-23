package VehiculosTest;

import Cargas.Bici;
import Cargas.Helatodo;
import Excepciones.CargaNoEsCargableException;
import Vehiculos.Auto;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AutoTest {

    @Test
    public void test01DadoUnAutoLeCargoUnaCargaCargableYSeCarga(){
        Auto auto = new Auto();
        Helatodo helatodo = new Helatodo();
        auto.cargar(helatodo);
        assertEquals(auto.descargar(),helatodo);
    }

    @Test
    public void test02DadaUnaCargaNoCargableIntentoCargarlaYLanzaError(){
        Auto auto = new Auto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, ()->auto.cargar(bici));
    }

    @Test
    public void test03DadaUnaBiciYUnAutoSinPortaBiciAlCargarlaLanzaExcepcion(){
        Auto auto = new Auto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, ()->auto.cargar(bici));
    }

    @Test
    public void test04DadaUnaBiciYUnAutoConPortaBiciAlCargarlaSeCarga(){
        Auto auto = new Auto();
        auto.agregarPortaBici();
        Bici bici = new Bici();
        auto.cargar(bici);
        assertEquals(auto.descargar(), bici);
    }
}
