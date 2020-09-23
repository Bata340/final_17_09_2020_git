package Cargas;

import Vehiculos.Vehiculo;

public class Bici extends Carga{
    @Override
    public boolean esCargable(Vehiculo vehiculo) {
        return vehiculo.poseePortaBici();
    }
}
