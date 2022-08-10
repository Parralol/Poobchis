package domain;

public class POOBCHISException extends Exception{
    public static final String SOLO_DEBEN_HABER_MENOS_DE_4_JUGADORES = "Agrego mas de la cantidad permitida de jugadores";
    public static final String NO_ELIGIO_NADA ="elige algun item valido";
    public static final String NO_ELIGIO_NADAJ1 ="elige algun item valido";
    public static final String NO_ELIGIO_NADAJ2 ="elige algun item valido";
    public static final String EXTENSION_ARCHIVO_NO_VALIDO ="extension del archivo no valido";
    public POOBCHISException(String a){

        super(a);

    }
}
