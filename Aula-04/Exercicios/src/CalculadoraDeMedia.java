import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraDeMedia {

  private ArrayList<Float> numeros;

  public CalculadoraDeMedia() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(float numero) {
    if (numero >= 0) {
      numeros.add(numero);
    }
  }

  public float calcularMedia() {
    if (numeros.isEmpty()) {
      return 0; // Retorna 0 se a lista estiver vazia para evitar divisão por zero.
    }

    float soma = 0;
    for (float numero : numeros) {
      soma += numero;
    }

    return soma / numeros.size();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CalculadoraDeMedia listaDeNumeros = new CalculadoraDeMedia();

    System.out.println(
      "Insira uma série de números (insira um número negativo para parar):"
    );

    float numeroInserido;
    do {
      System.out.print("Digite um número: ");
      numeroInserido = scanner.nextFloat();

      listaDeNumeros.adicionarNumero(numeroInserido);
    } while (numeroInserido >= 0);

    float media = listaDeNumeros.calcularMedia();
    System.out.println("Média dos números positivos inseridos: " + media);

    scanner.close();
  }
}
