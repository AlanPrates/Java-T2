import java.util.List;

public class Processo {
    private String numero;
    private List<ParteEnvolvida> partes;
    private Advogado advogado;
    private Juiz relator;
    private Juiz revisor;
    private Juiz prolator;
    private Status status;

    // Construtores
    public Processo(String numero, List<ParteEnvolvida> partes, Advogado advogado) {
        this.numero = numero;
        this.partes = partes;
        this.advogado = advogado;
        this.status = Status.ABERTO;
    }

    // Outro construtor para casos em que os juízes são conhecidos desde o início
    public Processo(String numero, List<ParteEnvolvida> partes, Advogado advogado, Juiz relator, Juiz revisor, Juiz prolator) {
        this.numero = numero;
        this.partes = partes;
        this.advogado = advogado;
        this.relator = relator;
        this.revisor = revisor;
        this.prolator = prolator;
        this.status = Status.EM_DISTRIBUICAO;
    }

    // Métodos
    public void setJuizes(Juiz relator, Juiz revisor, Juiz prolator) {
        this.relator = relator;
        this.revisor = revisor;
        this.prolator = prolator;
        this.status = Status.EM_DISTRIBUICAO;
    }

    public void realizarJulgamento() {
        // Lógica para realizar o julgamento (exemplo: atribuir decisão, calcular pena, etc.)
        this.status = Status.JULGADO;
    }

    public void executarSentenca() {
        // Lógica para executar a sentença (exemplo: cumprir pena, arquivar, etc.)
        this.status = Status.ARQUIVADO;
    }

    public boolean validarNumero() {
        return numero.matches("[0-9]+");
    }

    public String getNumero() {
        return numero;
    }

    public List<ParteEnvolvida> getPartes() {
        return partes;
    }

    public Advogado getAdvogado() {
        return advogado;
    }

    public Juiz getRelator() {
        return relator;
    }

    public Juiz getRevisor() {
        return revisor;
    }

    public Juiz getProlator() {
        return prolator;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Processo " + numero + ": " + partes.get(0) + " contra " + partes.get(1);
    }
}
