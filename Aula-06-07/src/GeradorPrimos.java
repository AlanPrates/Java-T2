import java.util.ArrayList;
import java.util.List;

public class GeradorPrimos {

    private static List<Integer> listarDivisores(int N) {
        List<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    private static int contarDivisores(int N) {
        int contador = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean ehPrimo(int numero) {
        return contarDivisores(numero) == 2;
    }

    public static void listarPrimosAteN(int N) {
        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void listarPrimeirosNPrimos(int N) {
        int contadorPrimos = 0;
        int numeroAtual = 2;

        while (contadorPrimos < N) {
            if (ehPrimo(numeroAtual)) {
                System.out.print(numeroAtual + " ");
                contadorPrimos++;
            }
            numeroAtual++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numeroTeste = 15;

        // Testar o método que lista todos os divisores de um número
        System.out.println("Divisores de " + numeroTeste + ":");
        for (int divisor : listarDivisores(numeroTeste)) {
            System.out.print(divisor + " ");
        }
        System.out.println();

        // Testar o método que verifica se um número é primo
        System.out.println(numeroTeste + " é primo? " + ehPrimo(numeroTeste));

        // Testar o método que lista todos os números primos menores ou iguais a N
        System.out.println("Números primos até " + numeroTeste + ":");
        listarPrimosAteN(numeroTeste);

        // Testar o método que lista os N primeiros números primos
        int N = 5;
        System.out.println("Os primeiros " + N + " números primos:");
        listarPrimeirosNPrimos(N);
    }
}
