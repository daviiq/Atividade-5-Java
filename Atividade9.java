import java.util.Scanner;
// O erro 1 estava na importação através de um java no inicio além de estar faltando o;
//import java.util.Scanner;

public class Atividade9 {
  public static void main(String[] args) {
       // O erro 2 estava na declaração da variável CONVERSAO, que estava com um final
       // Isso faz com que a conversão se torne uma constante, e não uma variável
        
        double CONVERSAO = 32;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextInt();
        
        double fahrenheit = celsius * 9/5 + CONVERSAO;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        CONVERSAO = 273.15; // Para converter para Kelvin
        double kelvin = celsius + CONVERSAO;
        
        System.out.println("Temperatura em Kelvin: " + kelvin);
    }
}
