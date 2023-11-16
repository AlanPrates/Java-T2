import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class VerificacaoMaiorIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Versão 2: Solicitar a data de nascimento e verificar a idade
        System.out.print("Digite o dia do seu nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o dia atual: ");
        int diaAtual = scanner.nextInt();

        System.out.print("Digite o mês atual: ");
        int mesAtual = scanner.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);

        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();

        System.out.println("Sua idade é: " + idade + " anos.");

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        scanner.close();
    }
}
