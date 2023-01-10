public class FuncionarioMedico extends Funcionario{

    public FuncionarioMedico(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoAlta.getTipoDocumentoAlta());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico";
    }
}
