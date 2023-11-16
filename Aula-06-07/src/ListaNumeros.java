import java.util.ArrayList;
import java.util.Collections;

public class ListaNumeros {

    private ArrayList<Float> numeros;

    public ListaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void novoNumero(float numero) {
        numeros.add(numero);
    }

    public void listaNumeros() {
        System.out.println("Números na lista:");
        for (float numero : numeros) {
            System.out.println(numero);
        }
    }

    public float media() {
        if (numeros.isEmpty()) {
            return 0; // Evita a divisão por zero se a lista estiver vazia
        }

        float soma = 0;
        for (float numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();
    }

    public void ordena() {
        Collections.sort(numeros);
    }

    public float mediana() {
        int tamanho = numeros.size();

        if (tamanho % 2 == 0) {
            // Se o tamanho da lista for par, calcula a média dos dois números do meio
            int meio1 = tamanho / 2 - 1;
            int meio2 = tamanho / 2;
            return (numeros.get(meio1) + numeros.get(meio2)) / 2;
        } else {
            // Se o tamanho da lista for ímpar, retorna o número do meio
            int meio = tamanho / 2;
            return numeros.get(meio);
        }
    }

    public void colocadoEm(int N) {
        if (N >= 1 && N <= numeros.size()) {
            System.out.println("O " + N + "º maior número é: " + numeros.get(numeros.size() - N));
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();

        lista.novoNumero(3.5f);
        lista.novoNumero(1.2f);
        lista.novoNumero(5.8f);
        lista.novoNumero(2.7f);

        lista.listaNumeros();

        System.out.println("Média: " + lista.media());

        lista.ordena();
        lista.listaNumeros();

        System.out.println("Mediana: " + lista.mediana());

        lista.colocadoEm(2);
    }
}
