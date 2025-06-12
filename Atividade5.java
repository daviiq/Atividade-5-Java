import java.util.Scanner;

public class Atividade5 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma coisa: ");
    String palavra2 = scanner.nextLine(); // Lê até o final da linha
    System.out.println("palavra2: " + palavra2);

    System.out.println("Digite mais uma coisa: ");
    String palavra = scanner.next();
    System.out.println("palavra: " + palavra);  // Lê só até o primeiro espaço

    scanner.close();
  }
} 

//Neste caso, descobrimos também que o método next() ao ser citado primeiro
// não permite a leitura do NextLine() que vem depois, pois o scanner já
// leu o espaço em branco que vem depois da palavra.
