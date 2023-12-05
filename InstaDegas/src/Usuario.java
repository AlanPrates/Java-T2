import java.util.LinkedList;

public class Usuario {
    public Usuario() {
        this.listaPostagens = new LinkedList<>();
        this.listaAmigos = new LinkedList<>();
    }
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaPostagens = new LinkedList<>();
        this.listaAmigos = new LinkedList<>();
    }
    private String nome;
    private String email;
    private String senha;
    private LinkedList<Postagem> listaPostagens;
    private LinkedList<Usuario> listaAmigos;

    // Metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LinkedList<Postagem> getListaPostagens() {
        return listaPostagens;
    }
    public LinkedList<Usuario> getListaAmigos() {
        return listaAmigos;
    }
    public void novaPostagem() {
        Postagem p = new Postagem();
        p.novaPostagem();
        this.listaPostagens.add(p);
    }
    public void listarPostagens() {
        System.out.println("Postagens de " + this.getNome());
        for (Postagem postagem : this.listaPostagens) {
            System.out.println(postagem.getConteudo());
        }
    }
    public void verPostagensAmigos() {
        for(Usuario u : this.getListaAmigos()) {
            u.listarPostagens();
        }
    }
    public void adicionaAmigo(Usuario amigo) {
        this.listaAmigos.add(amigo);
    }
    public void removeAmigo(Usuario amigo) {
        this.listaAmigos.remove(amigo);
    }
    public boolean novaAmizade(LinkedList<Usuario> amigos) {
        System.out.println("ADICIONAR AMIGO");
        System.out.println("Nome do amigo: ");
        String nomeAmigo = Main.ler().nextLine();

        for (Usuario u : amigos) {
            if (u.getNome().equals(nomeAmigo)) {
                this.adicionaAmigo(u);
                u.adicionaAmigo(this);
                System.out.println("Amigo adicionado!");
                return true;
            }
        }
        return false;
    }
    public boolean desfazerAmizade(LinkedList<Usuario> amigos) {
        System.out.println("Lista de amigos:");
        for (Usuario u : getListaAmigos()) {
            System.out.println("- " + u.getNome());
        }
        System.out.println("DESFAZER AMIZADE");
        System.out.println("Nome do amigo: ");
        String nomeAmigo = Main.ler().nextLine();

        for (Usuario u : amigos) {
            if (u.getNome().equals(nomeAmigo)) {
                this.removeAmigo(u);
                u.removeAmigo(this);
                System.out.println("Amizade desfeita!");
                return true;
            }
        }
        return false;
    }
    public void listaAmigos(){
        System.out.println("Lista de amigos:");
        for (Usuario u : this.getListaAmigos()) {
            System.out.println("- " + u.getNome());
        }
    }
    public void inicioUsuario(LinkedList<Usuario> amigos) {
        Main.limparTela();
        int op = 0;
        do{
            System.out.println(" === INSTADEGAS ===");
            System.out.println("[1] POSTAR");
            System.out.println("[2] VER POSTAGENS");
            System.out.println("[3] ADICIONAR AMIGO");
            System.out.println("[4] DESFAZER AMIZADE");
            System.out.println("[5] VER AMIGOS");
            System.out.println("[0] SAIR");
            System.out.print("> ");
            op = Main.ler().nextInt();
            switch (op) {
                case 1:
                    Main.limparTela();
                    System.out.println("POSTAR");
                    this.novaPostagem();
                    Main.pausa();
                    break;
                case 2:
                    Main.limparTela();
                    System.out.println("TIMELINE");
                    this.verPostagensAmigos();
                    Main.pausa();
                    break;
                case 3:
                    Main.limparTela();
                    if(!this.novaAmizade(amigos)) {
                        System.out.println("Amigo não encontrado!");
                    }
                    Main.pausa();
                    break;
                case 4:
                    Main.limparTela();
                    if(!this.desfazerAmizade(amigos)) {
                        System.out.println("Amigo não encontrado!");
                    }
                    Main.pausa();
                    break;
                case 5:
                    Main.limparTela();
                    this.listaAmigos();
                    Main.pausa();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    Main.pausa();
                    break;
            }
        }while(op != 0);
    }
}