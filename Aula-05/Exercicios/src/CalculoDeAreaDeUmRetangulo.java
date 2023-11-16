import java.util.Scanner;

public class CalculoDeAreaDeUmRetangulo {

    public static int calcularAreaRetangulo(int largura, int altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a largura e a altura do retângulo
        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        // Chamar a função para calcular a área e exibir o resultado
        int area = calcularAreaRetangulo(largura, altura);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
