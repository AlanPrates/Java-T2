import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita ao usuário que escolha a operação (+, -, *, /)
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        // Realiza a operação escolhida com base nos números fornecidos
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Verifica se o segundo número não é zero antes de realizar a divisão
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        // Exibe o resultado da operação
        System.out.println("Resultado: " + resultado);

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
