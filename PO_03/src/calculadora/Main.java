// calculadora/Main.java
package calculadora;

import exceptions.DivisionByZeroException;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            int resultadoInteiro = calculadora.dividirInteiros(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoInteiro);

            float resultadoFloat = calculadora.dividirFloats(5.0f, 2.0f);
            System.out.println("Resultado da divisão de floats: " + resultadoFloat);

            // Tentativa de divisão por zero
            float resultadoDivisaoZero = calculadora.dividirFloats(5.0f, 0.0f); // Isso lançará DivisionByZeroException
            System.out.println("Resultado da divisão de floats: " + resultadoDivisaoZero);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
