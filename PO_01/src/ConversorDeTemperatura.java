import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Escolha a unidade (C para Celsius, F para Fahrenheit): ");
        char unidade = scanner.next().charAt(0);

        double resultado = 0;

        if (unidade == 'C' || unidade == 'c') {
            resultado = celsiusParaFahrenheit(temperatura);
            System.out.println("Temperatura em Fahrenheit: " + resultado + " °F");
        } else if (unidade == 'F' || unidade == 'f') {
            resultado = fahrenheitParaCelsius(temperatura);
            System.out.println("Temperatura em Celsius: " + resultado + " °C");
        } else {
            System.out.println("Unidade inválida.");
        }

        scanner.close();
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
