import java.util.Scanner;

public class ConcatenacaoDeStrings {

    public static String concatenarStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void solicitarDigitacaoStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        // Chamada do método para concatenar as strings e exibir o resultado
        String resultado = concatenarStrings(string1, string2);
        exibirString(resultado);

        scanner.close();
    }

    public static void exibirString(String str) {
        System.out.println("A string resultante é: " + str);
    }

    public static void main(String[] args) {
        // Chamada do método para solicitar a digitação das strings e realizar a concatenação
        solicitarDigitacaoStrings();
    }
}
