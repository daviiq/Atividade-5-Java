import java.util.Scanner;
// O erro 1 estava na importação através de um java no inicio
//import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Além disso o comando print, faz com que não pule para a próxima linha,
        //não é um erro, mas é sempre bom deixar organizado.
        System.out.println("Digite sua idade: "); 
        int idade = entrada.nextInt(); 

        //Como o sistema estava apresentando erro no buffer,
        //Isso fazia com que o comando Enter fosse enviado 2x
        //Para solucionar, basta dar o comando abaixo:
        entrada.nextLine(); 

        System.out.println("Digite seu nome completo: ");
        String nome = entrada.nextLine();
        
        System.out.println("Nome: " + nome + ", Idade: " + idade);
        entrada.close();
    }
}
