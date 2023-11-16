import java.util.Scanner;

public class CalculosEstatisticos {

    public static int fatorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fatorial(x - 1);
        }
    }

    public static int arranjo(int N, int P) {
        if (N >= P && N >= 0 && P >= 0) {
            return fatorial(N) / fatorial(N - P);
        } else {
            System.out.println("Entrada inválida para arranjo.");
            return -1;
        }
    }

    public static int combinacao(int N, int P) {
        if (N >= P && N >= 0 && P >= 0) {
            return fatorial(N) / (fatorial(P) * fatorial(N - P));
        } else {
            System.out.println("Entrada inválida para combinação.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testar a função fatorial
        System.out.print("Digite um número para calcular o fatorial: ");
        int numeroFatorial = scanner.nextInt();
        System.out.println("Fatorial de " + numeroFatorial + ": " + fatorial(numeroFatorial));

        // Testar a função arranjo
        System.out.print("Digite N para calcular o arranjo (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite P para calcular o arranjo (P): ");
        int P = scanner.nextInt();
        System.out.println("Arranjo de " + N + " tomados " + P + " a " + P + ": " + arranjo(N, P));

        // Testar a função combinação
        System.out.print("Digite N para calcular a combinação (N): ");
        N = scanner.nextInt();
        System.out.print("Digite P para calcular a combinação (P): ");
        P = scanner.nextInt();
        System.out.println("Combinação de " + N + " tomados " + P + " a " + P + ": " + combinacao(N, P));

        scanner.close();
    }
}
