package Vehiculos;

import Cargas.Carga;
import Excepciones.CargaNoEsCargableException;

import java.util.Stack;

public abstract class Vehiculo {
    protected Stack<Carga> cargas;
    protected boolean poseePortaBici;

    public Vehiculo(){
        this.cargas = new Stack<>();
    }

    public void cargar(Carga carga) {
        if (carga.esCargable(this)) {
            this.cargas.push(carga);
        }
        else{
            throw new CargaNoEsCargableException();
        }
    }

    public Carga descargar() {
        return this.cargas.pop();
    }

    public abstract void agregarPortaBici();

    public boolean poseePortaBici(){
        return this.poseePortaBici;
    }
}
