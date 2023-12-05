public class Postagem {
    private String conteudo;
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public void novaPostagem(){
        System.out.println("Mensagem: ");
        this.conteudo = Main.ler().nextLine();
    }
}