public class FuncionarioAtendente extends Funcionario{

    public FuncionarioAtendente(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoInternacao.getTipoDocumentoInternacao());
        setFuncionarioSuperior(superior);

    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
