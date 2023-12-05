import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void limparTela(){
        System.out.println("\n\n\n\n\n\n\n\n\n");
    }
    public static Scanner ler(){
        return new Scanner(System.in);
    }
    public static void pausa(){
        System.out.print("Pressione ENTER para continuar...");
        ler().nextLine();
    }
    public static void main(String[] args) {
        LinkedList<Sessao> historico = new LinkedList<>();
        App app = new App();
        int op;
        do{
            limparTela();
            System.out.println(" === INSTADEGAS ===");
            System.out.println("[1] LOGAR");
            System.out.println("[2] CADASTRAR-SE");
            System.out.println("[3] ENCERRAR CONTA");
            System.out.println("[0] SAIR");
            System.out.print("> ");
            op = ler().nextInt();

            switch (op) {
                case 1:
                    limparTela();
                    try{
                        Sessao novaSessao = new Sessao(App.logar(app));
                        novaSessao.setDataHoraFim(new Date());
                        historico.add(novaSessao);
                    } catch (Exception e){
                        System.out.println("Usuario ou senha invalidos");
                    }
                    pausa();
                    break;
                case 2:
                    limparTela();
                    app.cadastrar();
                    pausa();
                    break;
                case 3:
                    limparTela();
                    try{
                        app.removeUsuario();
                    } catch (Exception e){
                        System.out.println("Usuario ou senha invalidos");
                    }
                    pausa();
                    break;
                case 0:
                    limparTela();
                    System.out.println("Encerrando programa...");
                    pausa();
                    break;
                default:
                    limparTela();
                    System.out.println("Opção invalida");
                    pausa();
                    break;
            }
        }while(op != 0);
    }
}