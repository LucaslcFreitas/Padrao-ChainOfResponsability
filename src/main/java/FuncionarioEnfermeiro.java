public class FuncionarioEnfermeiro extends Funcionario{

    public FuncionarioEnfermeiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoMedicacao.getTipoDocumentoMedicacao());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
}
