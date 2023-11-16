import java.util.Scanner;

public class TrocaVariaveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira os valores
        System.out.print("Digite o valor da variável A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor da variável B: ");
        int b = scanner.nextInt();

        // Trocar os valores sem usar variável temporária (usando XOR)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // Exibir os valores após a troca
        System.out.println("Após a troca:");
        System.out.println("Valor da variável A: " + a);
        System.out.println("Valor da variável B: " + b);

        scanner.close();
    }
}
