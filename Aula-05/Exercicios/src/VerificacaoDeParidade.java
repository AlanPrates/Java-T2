import java.util.Scanner;

public class VerificacaoDeParidade {

    public static boolean verificarParidade(int numero) {
        // Usando o operador módulo (%) para verificar se o número é par ou ímpar
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Chamar o método para verificar paridade e exibir o resultado
        if (verificarParidade(numero)) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
