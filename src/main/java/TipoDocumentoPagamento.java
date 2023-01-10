public class TipoDocumentoPagamento implements TipoDocumento{

    private static TipoDocumentoPagamento tipoDocumentoPagamento = new TipoDocumentoPagamento();

    private TipoDocumentoPagamento() {};

    public static TipoDocumentoPagamento getTipoDocumentoPagamento() {
        return tipoDocumentoPagamento;
    }
}
