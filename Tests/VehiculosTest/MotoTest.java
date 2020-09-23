package VehiculosTest;

import Cargas.Bici;
import Cargas.Helatodo;
import Excepciones.CargaNoEsCargableException;
import Excepciones.MotoNoPuedeTenerPortaBiciException;
import Vehiculos.Moto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MotoTest {

    @Test
    public void test01DadaUnaMotoLeCargoUnaCargaCargableYSeCarga(){
        Moto moto = new Moto();
        Helatodo helatodo = new Helatodo();
        moto.cargar(helatodo);
        assertEquals(moto.descargar(),helatodo);
    }

    @Test
    public void test02DadaUnaCargaNoCargableIntentoCargarlaYLanzaError(){
        Moto moto = new Moto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, ()->moto.cargar(bici));
    }

    @Test
    public void test03DadaUnaBiciYUnaMotoAlCargarlaLanzaExcepcion(){
        Moto moto = new Moto();
        Bici bici = new Bici();
        assertThrows(CargaNoEsCargableException.class, ()->moto.cargar(bici));
    }

    @Test
    public void test04DadaUnaMotoIntentoCargarleUnPortaBiciYLanzaExcepcion(){
        Moto moto = new Moto();
        assertThrows(MotoNoPuedeTenerPortaBiciException.class, () -> moto.agregarPortaBici());
    }
}
