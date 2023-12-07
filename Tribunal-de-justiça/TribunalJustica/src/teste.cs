import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

enum Status {
    ABERTO,
    EM_DISTRIBUICAO,
    JULGADO,
    ARQUIVADO
}

class ParteEnvolvida {
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



class Processo {
        private String numero;
        private List<ParteEnvolvida> partes;
        private Advogado advogado;
        private Juiz relator;
        private Juiz revisor;
        private Juiz prolator;
        private Status status;

    public Processo(String numero, List<ParteEnvolvida> partes, Advogado advogado) {
        this.numero = numero;
        this.partes = partes;
        this.advogado = advogado;
        this.status = Status.ABERTO;
    }

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

class SistemaJudicial {

    private static List<Processo> processos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;

        do {
            exibirMenu();
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (escolha) {

                case 1:
                    criarNovoProcesso();
                    break;
                case 2:
                    listarProcessos();
                    break;
                case 3:
                    distribuirProcesso();
                    break;
                case 4:
                    realizarJulgamento();
                    break;
                case 5:
                    executarSentenca();
                    break;
                case 6:
                    listarProcessosComAndamento();
                    break;
                case 7:
                    gerarRelatorioProcessosAbertos();
                    break;
                case 8:
                    gerarRelatorioProcessosEmDistribuicao();
                    break;
                case 9:
                    gerarRelatorioProcessosJulgados();
                    break;
                case 10:
                    arquivarProcesso();  // Adicionada opção
                    break;
                case 11:
                    gerarRelatorioProcessosArquivados();  // Adicionada opção
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n=== Sistema Judicial ===");
        System.out.println("1. Criar Novo Processo");
        System.out.println("2. Listar Processos");
        System.out.println("3. Distribuir Processo");
        System.out.println("4. Realizar Julgamento");
        System.out.println("5. Executar Sentença");
        System.out.println("6. Listar Processos com Andamento");
        System.out.println("7. Gerar Relatório de Processos Abertos");
        System.out.println("8. Gerar Relatório de Processos em Distribuição");
        System.out.println("9. Gerar Relatório de Processos Julgados");
        System.out.println("10. Arquivar Processo");
        System.out.println("11. Gerar Relatório de Processos Arquivados");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarNovoProcesso() {
        System.out.println("\n=== Criar Novo Processo ===");

        System.out.print("Número do processo: ");
        String numeroProcesso = scanner.nextLine();

        if (!numeroProcesso.matches("[0-9]+")) {
            System.out.println("Número de processo inválido.");
            return;
        }

        System.out.print("Nome do autor: ");
        String nomeAutor = scanner.nextLine();

        System.out.print("Documento do autor: ");
        String documentoAutor = scanner.nextLine();

        ParteEnvolvida autor = new ParteEnvolvida(nomeAutor, "Autor", documentoAutor);

        System.out.print("Nome do réu: ");
        String nomeReu = scanner.nextLine();

        System.out.print("Documento do réu: ");
        String documentoReu = scanner.nextLine();

        ParteEnvolvida reu = new ParteEnvolvida(nomeReu, "Réu", documentoReu);

        List<ParteEnvolvida> partes = new ArrayList<>();
        partes.add(autor);
        partes.add(reu);

        Advogado advogado = new Advogado("Advogado do Autor", documentoAutor);

        Processo novoProcesso = new Processo(numeroProcesso, partes, advogado);
        processos.add(novoProcesso);

        System.out.println("Novo processo criado com sucesso.");
    }

    private static void listarProcessos() {
        System.out.println("\n=== Lista de Processos ===");

        if (processos.isEmpty()) {
            System.out.println("Nenhum processo registrado.");
        } else {
            for (int i = 0; i < processos.size(); i++) {
                System.out.println((i + 1) + ". " + processos.get(i));
            }
        }
    }

    private static void distribuirProcesso() {
        System.out.println("\n=== Distribuir Processo ===");

        if (processos.isEmpty()) {
            System.out.println("Nenhum processo disponível para distribuição.");
        } else {
            System.out.print("Digite o índice do processo a ser distribuído: ");
            int indiceProcesso = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (indiceProcesso >= 1 && indiceProcesso <= processos.size()) {
                Processo processoSelecionado = processos.get(indiceProcesso - 1);

                System.out.print("Digite o nome do relator: ");
                String nomeRelator = scanner.nextLine();
                Juiz relator = new Juiz(nomeRelator);

                System.out.print("Digite o nome do revisor: ");
                String nomeRevisor = scanner.nextLine();
                Juiz revisor = new Juiz(nomeRevisor);

                System.out.print("Digite o nome do prolator: ");
                String nomeProlator = scanner.nextLine();
                Juiz prolator = new Juiz(nomeProlator);

                processoSelecionado.setJuizes(relator, revisor, prolator);
                System.out.println("Processo distribuído com sucesso.");
            } else {
                System.out.println("Índice inválido. Tente novamente.");
            }
        }
    }

    private static void realizarJulgamento() {
        System.out.println("\n=== Realizar Julgamento ===");

        if (processos.isEmpty()) {
            System.out.println("Nenhum processo disponível para julgamento.");
        } else {
            System.out.print("Digite o índice do processo a ser julgado: ");
            int indiceProcesso = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (indiceProcesso >= 1 && indiceProcesso <= processos.size()) {
                Processo processoSelecionado = processos.get(indiceProcesso - 1);

                // Lógica para realizar o julgamento (exemplo: atribuir decisão, calcular pena, etc.)
                processoSelecionado.realizarJulgamento();
                System.out.println("Julgamento realizado para o processo " + processoSelecionado.getNumero());
            } else {
                System.out.println("Índice inválido. Tente novamente.");
            }
        }
    }

    private static void executarSentenca() {
        System.out.println("\n=== Executar Sentença ===");

        if (processos.isEmpty()) {
            System.out.println("Nenhum processo disponível para execução de sentença.");
        } else {
            System.out.print("Digite o índice do processo a ter a sentença executada: ");
            int indiceProcesso = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (indiceProcesso >= 1 && indiceProcesso <= processos.size()) {
                Processo processoSelecionado = processos.get(indiceProcesso - 1);

                // Lógica para executar a sentença (exemplo: cumprir pena, arquivar, etc.)
                processoSelecionado.executarSentenca();
                System.out.println("Sentença executada para o processo " + processoSelecionado.getNumero());
            } else {
                System.out.println("Índice inválido. Tente novamente.");
            }
        }
    }

    private static void listarProcessosComAndamento() {
        System.out.println("\n=== Lista de Processos com Andamento ===");

        for (Processo processo : processos) {
            System.out.println(processo.getNumero() + ": " + processo.getStatus());
        }
    }

    private static void gerarRelatorioProcessosAbertos() {
        List<Processo> processosAbertos = processos.stream()
                .filter(processo -> processo.getStatus() == Status.ABERTO)
                .collect(Collectors.toList());

        System.out.println("\nRelatório de processos abertos:");
        for (Processo processo : processosAbertos) {
            System.out.println(processo);
        }
    }

    private static void gerarRelatorioProcessosEmDistribuicao() {
        List<Processo> processosEmDistribuicao = processos.stream()
                .filter(processo -> processo.getStatus() == Status.EM_DISTRIBUICAO)
                .collect(Collectors.toList());

        System.out.println("\nRelatório de processos em distribuição:");
        for (Processo processo : processosEmDistribuicao) {
            System.out.println(processo);
        }
    }

    private static void gerarRelatorioProcessosJulgados() {
        List<Processo> processosJulgados = processos.stream()
                .filter(processo -> processo.getStatus() == Status.JULGADO)
                .collect(Collectors.toList());

        System.out.println("\nRelatório de processos julgados:");
        for (Processo processo : processosJulgados) {
            System.out.println(processo);
        }
    }

    private static void arquivarProcesso() {
        System.out.println("\n=== Arquivar Processo ===");

        if (processos.isEmpty()) {
            System.out.println("Nenhum processo disponível para arquivamento.");
        } else {
            System.out.print("Digite o índice do processo a ser arquivado: ");
            int indiceProcesso = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (indiceProcesso >= 1 && indiceProcesso <= processos.size()) {
                Processo processoSelecionado = processos.get(indiceProcesso - 1);

                if (processoSelecionado.getStatus() == Status.JULGADO) {
                    processoSelecionado.executarSentenca();  // Marcar como arquivado
                    System.out.println("Processo arquivado com sucesso.");
                } else {
                    System.out.println("O processo deve ser julgado antes de ser arquivado.");
                }
            } else {
                System.out.println("Índice inválido. Tente novamente.");
            }
        }
    }

    private static void gerarRelatorioProcessosArquivados() {
        List<Processo> processosArquivados = processos.stream()
                .filter(processo -> processo.getStatus() == Status.ARQUIVADO)
                .collect(Collectors.toList());

        System.out.println("\nRelatório de processos arquivados:");
        for (Processo processo : processosArquivados) {
            System.out.println(processo);
        }
    }
}
