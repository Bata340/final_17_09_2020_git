package Vehiculos;

import Excepciones.MotoNoPuedeTenerPortaBiciException;

public class Moto extends Vehiculo{
    @Override
    public void agregarPortaBici() {
        throw new MotoNoPuedeTenerPortaBiciException();
    }
}
