import java.util.Scanner;

public class Atividade10{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();


        System.out.print("Digite o código do produto: ");
        int codigo = input.nextInt();


        System.out.print("Digite o preço unitário: ");
        double unitario = input.nextDouble();


        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = input.nextInt();

        System.out.print("O produto está ativo (true/false): ");
        boolean ativo = input.nextBoolean();

        double total = unitario * quantidade;

        System.out.printf("\n -------- informações do produto -----\n \nInformações do produto: %s\nCódigo do produto: %d\nPreço unitário do produto: %.2f\nQuantidade em estoque: %d\nProduto está ativo: %b\nValor total em estoque: %.2f%n", produto, codigo, unitario, quantidade, ativo, total);

        input.close();
    }
}
