import java.util.Scanner;

public class MediaPonderada {

    public static float calcularMediaPonderada(float nota1, float nota2, float nota3, float peso1, float peso2, float peso3) {
        float somaNotas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        float somaPesos = peso1 + peso2 + peso3;

        return somaNotas / somaPesos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do usuário
        System.out.print("Digite a nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite o peso da nota 1: ");
        float peso1 = scanner.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite o peso da nota 2: ");
        float peso2 = scanner.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = scanner.nextFloat();

        System.out.print("Digite o peso da nota 3: ");
        float peso3 = scanner.nextFloat();

        // Calcular e exibir a média ponderada
        float mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
        System.out.println("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }
}
