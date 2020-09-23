package Cargas;

import Vehiculos.Vehiculo;

public class Helatodo extends Carga{

    @Override
    public boolean esCargable(Vehiculo vehiculo) {
        return true;
    }

}
