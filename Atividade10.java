import java.util.Scanner;

public class Problema{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();


        System.out.print("\nDigite o código do produto: ");
        int codigo = input.nextInt();


        System.out.print("\nDigite o preço unitário: ");
        double unitario = input.nextDouble();


        System.out.print("\nDigite a quantidade em estoque: ");
        int quantidade = input.nextInt();

        System.out.print("\nO produto está ativo (true/false): ");
        boolean ativo = input.nextBoolean();

        double total = unitario * quantidade;

        System.out.printf("Informações do produto: %s", );


    }
}
