import java.util.Scanner;

public class Atividade2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Declaração de variáveis
    int idade;
    double altura;


    // Pede ao usuário que digite seu nome e exibe uma saudação
    System.out.println("Digte seu nome:");
    String nome = scanner.nextLine();
    System.out.println("Olá, " + nome + "!");

    // Pede ao usuário que digite sua idade

    System.out.println("Digite sua idade:");
    idade = scanner.nextInt();
    System.out.printf("Então você tem: %d anos.\n", idade);
    // Exibe a idade e altura do usuário

    System.out.println("Digite sua altura:");
    altura = scanner.nextDouble();
    System.out.println("Sua altura é: " + altura + " metros.");

    scanner.close();
    // Exibe uma mensagem de despedida
    System.out.println("Obrigado por participar, " + nome + "! Vou te cadastrar no serasa");
  }
}
