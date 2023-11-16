import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Pergunta {
    private String textoPergunta;
    private ArrayList<String> alternativas;
    private int alternativaCorreta;

    public Pergunta(String textoPergunta, ArrayList<String> alternativas, int alternativaCorreta) {
        this.textoPergunta = textoPergunta;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    public void executarPergunta() {
        // Exibir a pergunta e as alternativas
        System.out.println(textoPergunta);
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println((i + 1) + ". " + alternativas.get(i));
        }

        // Solicitar a resposta do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a alternativa correta (1 a 4): ");
        int respostaUsuario = scanner.nextInt();

        // Verificar a resposta e exibir o resultado
        if (respostaUsuario == alternativaCorreta) {
            System.out.println("Resposta correta!\n");
        } else {
            System.out.println("Resposta incorreta. A alternativa correta era a " + alternativaCorreta + ".\n");
        }
    }
}

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar perguntas e adicioná-las à lista
        ArrayList<Pergunta> perguntas = new ArrayList<>();
        perguntas.add(new Pergunta("Qual é a capital do Brasil?",
                new ArrayList<>(List.of("Brasília", "Rio de Janeiro", "São Paulo", "Belo Horizonte")), 1));

        perguntas.add(new Pergunta("Qual é o maior planeta do Sistema Solar?",
                new ArrayList<>(List.of("Terra", "Júpiter", "Marte", "Vênus")), 2));

        perguntas.add(new Pergunta("Quem escreveu 'Romeu e Julieta'?",
                new ArrayList<>(List.of("Miguel de Cervantes", "William Shakespeare", "Charles Dickens", "Jane Austen")), 2));

        // Executar o quiz
        int totalPerguntas = perguntas.size();
        int corretas = 0;

        for (Pergunta pergunta : perguntas) {
            pergunta.executarPergunta();
            corretas += 1;  // Incrementar o número de respostas corretas
        }

        // Exibir pontuação
        System.out.println("Pontuação: " + corretas + " corretas de " + totalPerguntas + " questões.");

        scanner.close();
    }
}
