import java.util.Scanner;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = 0; // A idade inicia com 0
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nome e CPF
        System.out.print("Digite o nome: ");
        String nomeDigitado = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpfDigitado = scanner.nextLine();

        // Criar objeto Cliente
        Cliente cliente = new Cliente(nomeDigitado, cpfDigitado);

        // Mostrar os dados
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());

        // Solicitar alteração dos dados
        System.out.println("\nDigite novos dados:");

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        cliente.setNome(novoNome);

        System.out.print("Nova idade: ");
        int novaIdade = scanner.nextInt();
        cliente.setIdade(novaIdade);

        // Mostrar os dados atualizados
        System.out.println("\nDados atualizados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());

        // Fechar o scanner
        scanner.close();
    }
}
