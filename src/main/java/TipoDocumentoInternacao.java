public class TipoDocumentoInternacao implements TipoDocumento{

    private static TipoDocumentoInternacao tipoDocumentoInternacao = new TipoDocumentoInternacao();

    private TipoDocumentoInternacao() {};

    public static TipoDocumentoInternacao getTipoDocumentoInternacao() {
        return tipoDocumentoInternacao;
    }
}
