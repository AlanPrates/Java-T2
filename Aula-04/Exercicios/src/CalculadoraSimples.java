import java.util.Scanner;

public class CalculadoraSimples {

    public static float realizarOperacao(char operacao, float num1, float num2) {
        float resultado = 0;

        switch (operacao) {
            case 'A':
                resultado = num1 + num2;
                break;
            case 'S':
                resultado = num1 - num2;
                break;
            case 'M':
                resultado = num1 * num2;
                break;
            case 'D':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira dois números float
        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        // Mostrar menu de operações
        System.out.println("Escolha uma operação:");
        System.out.println("A - Adição");
        System.out.println("S - Subtração");
        System.out.println("M - Multiplicação");
        System.out.println("D - Divisão");

        // Solicitar a operação desejada
        System.out.print("Digite a letra da operação desejada: ");
        char operacao = scanner.next().charAt(0);

        // Realizar a operação e exibir o resultado
        float resultado = realizarOperacao(operacao, num1, num2);
        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}
