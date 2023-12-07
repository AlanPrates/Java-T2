public class ParteEnvolvida {
    private String nome;
    private String tipo;
    private String documento;

    public ParteEnvolvida(String nome, String tipo, String documento) {
        this.nome = nome;
        this.tipo = tipo;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return tipo + ": " + nome;
    }
}
