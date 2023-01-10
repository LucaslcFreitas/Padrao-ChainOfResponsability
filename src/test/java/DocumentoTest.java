import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioMedico medico;
    FuncionarioCirurgiao cirurgiao;
    FuncionarioEnfermeiro enfermeiro;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        medico = new FuncionarioMedico(null);
        cirurgiao = new FuncionarioCirurgiao(medico);
        enfermeiro = new FuncionarioEnfermeiro(cirurgiao);
        atendente = new FuncionarioAtendente(enfermeiro);
    }

    @Test
    void deveRetornarAtendenteParaAssinaturaInternacao() {
        assertEquals("Atendente", atendente.assinarDocumento(new Documento(TipoDocumentoInternacao.getTipoDocumentoInternacao())));
    }

    @Test
    void deveRetornarEnfermeiroParaAssinaturaMedicacao() {
        assertEquals("Enfermeiro", atendente.assinarDocumento(new Documento(TipoDocumentoMedicacao.getTipoDocumentoMedicacao())));
    }

    @Test
    void deveRetornarCirurgiaoParaAssinaturaCirurgia() {
        assertEquals("Cirurgião", atendente.assinarDocumento(new Documento(TipoDocumentoCirurgia.getTipoDocumentoCirurgia())));
    }

    @Test
    void deveRetornarMedicoParaAssinaturaAlta() {
        assertEquals("Médico", atendente.assinarDocumento(new Documento(TipoDocumentoAlta.getTipoDocumentoAlta())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaPagamento() {
        assertEquals("Sem assinatura", atendente.assinarDocumento(new Documento(TipoDocumentoPagamento.getTipoDocumentoPagamento())));
    }

}