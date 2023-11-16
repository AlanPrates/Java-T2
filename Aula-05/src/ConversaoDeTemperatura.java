import java.util.Scanner;

public class ConversaoDeTemperatura {

    public static double converterTemperatura(double temperatura, int tipo) {
        if (tipo == 0) { // Celsius para Fahrenheit
            return (temperatura * 9/5) + 32;
        } else if (tipo == 1) { // Fahrenheit para Celsius
            return (temperatura - 32) * 5/9;
        } else {
            throw new IllegalArgumentException("Tipo de conversão inválido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("0. Converter de Celsius para Fahrenheit");
        System.out.println("1. Converter de Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        double resultado = converterTemperatura(temperatura, escolha);

        if (escolha == 0) {
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (escolha == 1) {
            System.out.println("A temperatura em Celsius é: " + resultado);
        }

        scanner.close();
    }
}
