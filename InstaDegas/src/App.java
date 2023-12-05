import java.util.LinkedList;

public class App {
    public App() {
        this.listaUsuarios = new LinkedList<>();
    }
    private LinkedList<Usuario> listaUsuarios;
    public LinkedList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    public void adicionarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
    }
    public static Usuario logar(App app){
        System.out.println("LOGIN");
        System.out.println("Email: ");
        String usuario = Main.ler().nextLine();
        System.out.println("Senha: ");
        String senha = Main.ler().nextLine();

        for(Usuario s : app.getListaUsuarios()){
            if(s.getEmail().equals(usuario) && s.getSenha().equals(senha)){
                s.inicioUsuario(app.getListaUsuarios());
                return s;
            }
        }
        throw new RuntimeException("Erro ao logar");
    }
    public void cadastrar(){
        System.out.println("CADASTRO");
        System.out.println("Nome: ");
        String nome = Main.ler().nextLine();
        System.out.println("Email: ");
        String email = Main.ler().nextLine();
        System.out.println("Senha: ");
        String senha = Main.ler().nextLine();
        Usuario novo = new Usuario(nome, email, senha);
        this.adicionarUsuario(novo);
        System.out.println("Cadastrado com sucesso!");
    }
    public void removeUsuario(){
        System.out.println("DELETAR CONTA");
        System.out.println("Email: ");
        String email = Main.ler().nextLine();
        System.out.println("Senha: ");
        String senha = Main.ler().nextLine();

        for(Usuario s : this.getListaUsuarios()){
            if(s.getEmail().equals(email) && s.getSenha().equals(senha)){
                this.getListaUsuarios().remove(s);
                System.out.println("Deletado com sucesso!");
                return;
            }
        }
        throw new RuntimeException("Erro ao deletar");
    }
}