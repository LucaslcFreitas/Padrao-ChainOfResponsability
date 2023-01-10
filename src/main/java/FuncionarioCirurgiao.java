public class FuncionarioCirurgiao extends Funcionario{

    public FuncionarioCirurgiao(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCirurgia.getTipoDocumentoCirurgia());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Cirurgião";
    }
}
