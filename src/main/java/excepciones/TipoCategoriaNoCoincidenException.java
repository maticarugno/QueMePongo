package excepciones;

public class TipoCategoriaNoCoincidenException extends RuntimeException {
    public TipoCategoriaNoCoincidenException (String message){
        super(message);
    }
}
