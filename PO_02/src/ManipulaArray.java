import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayUsuario();
        int[] arrayAleatorio = criarArrayAleatorio();

        System.out.println("Soma dos elementos no array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor no array do usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor no array do usuário: " + encontrarMenorValor(arrayUsuario));
    }

    public static int[] criarArrayUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array aleatório: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Altere o valor máximo conforme necessário
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int valor : array) {
            soma += valor;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int valor : array) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int valor : array) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }
}
