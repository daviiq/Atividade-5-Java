import java.util.Scanner;

public class Atividade12 {
  public static void main(String[] args) {

    // Declaração de variáveis
    int idade;
    double peso;
    double altura;
    float imc;
    String nome;

    Scanner entrada = new Scanner(System.in);

    // Pede ao usuário que digite seu nome e exibe uma saudação
    System.out.println("Digte seu nome:");
    nome = entrada.nextLine();
    System.out.printf("Olá, %s. \n" , nome );

    // Pede ao usuário que digite sua idade

    System.out.println("Digite sua idade:");
    idade = entrada.nextInt();
    System.out.printf("Então você tem: %d anos.\n", idade);
   
   // Pede ao usuário que digite seu peso
    System.out.println("Digite seu peso:");
    peso = entrada.nextDouble();
    System.out.println("Seu peso é: " + peso + " kg.");

    // Exibe a idade e altura do usuário

    System.out.println("Digite sua altura:");
    altura = entrada.nextDouble();
    System.out.println("Sua altura é: " + altura + " metros.");

    // Calcula o IMC
    imc = (float) (peso / (altura * altura));
    System.out.printf("Seu IMC é: %.2f\n", imc);

    entrada.close();
  }
}
