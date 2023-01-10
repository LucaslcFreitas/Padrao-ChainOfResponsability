public class TipoDocumentoMedicacao implements TipoDocumento{

    private static TipoDocumentoMedicacao tipoDocumentoMedicacao = new TipoDocumentoMedicacao();

    private TipoDocumentoMedicacao() {};

    public static TipoDocumentoMedicacao getTipoDocumentoMedicacao() {
        return tipoDocumentoMedicacao;
    }
}
