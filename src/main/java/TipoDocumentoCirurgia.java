public class TipoDocumentoCirurgia implements TipoDocumento{

    private static TipoDocumentoCirurgia tipoDocumentoCirurgia = new TipoDocumentoCirurgia();

    private TipoDocumentoCirurgia() {};

    public static TipoDocumentoCirurgia getTipoDocumentoCirurgia() {
        return tipoDocumentoCirurgia;
    }
}
