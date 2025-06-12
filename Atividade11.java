import java.util.Scanner;
// O erro 1 estava na importação através de um java no inicio
//import java.util.Scanner;


public class Atividade11{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //O erro 2 estava na declaração da variável area, que estava com nextDouble
        //Isso faz com que a variável area seja do tipo double, e não float

        System.out.print("Digite a largura: ");
        float largura = entrada.nextFloat();
        
        System.out.print("Digite a altura: ");
        float altura = entrada.nextFloat();
        
        // O erro 3 estava na declaração da variável area, que estava com int
        // Isso faz com que a variável area seja do tipo inteiro e não double
        
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area + " metros");
        
        entrada.close();
    }
}
