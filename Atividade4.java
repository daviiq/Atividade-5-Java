import java.util.Scanner; 
// O erro 1 estava na importação através de um java no inicio
//import java.util.Scanner;
// Além disso o Scanner estava com letra minúscula, o correto é com letra maiúscula

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // O erro 2 estava na declaração da variável, que deve ser do tipo int
        // deve ser utilizado para números inteiros, da seguinte forma:
        // int numero;

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        
        // O erro 3 está aqui, pois está utilizando double para ler um número inteiro 
        //com nextDouble(),que é para números decimais
        
        System.out.println("Número digitado: " + numero);
    }
}
