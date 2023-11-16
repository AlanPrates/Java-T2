public class NumerosInteiros {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Declare duas variáveis do tipo int e atribua valores a elas
        int numero1 = 5;
        int numero2 = 7;

        // Chame o método somar e exiba a soma dos números
        int resultado = somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}
