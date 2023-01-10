public class TipoDocumentoAlta implements TipoDocumento{

    private static TipoDocumentoAlta tipoDocumentoAlta = new TipoDocumentoAlta();

    private TipoDocumentoAlta() {};

    public static TipoDocumentoAlta getTipoDocumentoAlta() {
        return tipoDocumentoAlta;
    }
}
