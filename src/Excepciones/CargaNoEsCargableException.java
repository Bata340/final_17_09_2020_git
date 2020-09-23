package Excepciones;

public class CargaNoEsCargableException extends RuntimeException{
    public CargaNoEsCargableException(){
        super ("La carga introducida no es cargable.");
    }
}
