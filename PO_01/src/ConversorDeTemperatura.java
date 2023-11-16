import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a temperatura
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        // Solicita ao usuário que escolha a unidade de temperatura (Celsius ou Fahrenheit)
        System.out.print("Escolha a unidade (C para Celsius, F para Fahrenheit): ");
        char unidade = scanner.next().charAt(0);

        double resultado = 0;

        // Converte a temperatura com base na escolha do usuário
        if (unidade == 'C' || unidade == 'c') {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + resultado + " °F");
        } else if (unidade == 'F' || unidade == 'f') {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + resultado + " °C");
        } else {
            System.out.println("Unidade inválida.");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }

    // Converte de Celsius para Fahrenheit
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Converte de Fahrenheit para Celsius
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
