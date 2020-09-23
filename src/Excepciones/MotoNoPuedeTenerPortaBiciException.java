package Excepciones;

public class MotoNoPuedeTenerPortaBiciException extends RuntimeException{

    public MotoNoPuedeTenerPortaBiciException() {
        super("Una moto no puede tener un porta bici.");
    }

}
