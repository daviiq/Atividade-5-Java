import java.util.Scanner;

public class Atividade13 {
  public static void main(String[] args) {
    
    //Declaração de variáveis
    double valortotal;
    double valorpago;
    float troco;
    Scanner compra = new Scanner(System.in);

    //Digita o valor total da compra e o valor pago pelo cliente
    System.out.println("Digite o valor total da compra:");
    valortotal = compra.nextDouble();

    // Verifica o valor pago pelo cliente:
    System.out.println("Digite o valor pago pelo cliente:");
    valorpago = compra.nextDouble();

    // Calcula o troco

    //Aqui fizemos o (float) para converter o resultado do cálculo de troco
    // para o tipo float, que serveria para economizar memória,
    // mas como o valor do troco pode ser negativo, é melhor usar double.
    troco = (float) (valorpago - valortotal);
    if (troco < 0) {
      System.out.println("Valor pago é insuficiente para cobrir o valor total da compra.");
    } else {
      System.out.printf("O troco a ser devolvido é: R$ %.2f\n", troco);
    }
    compra.close();
  }
}
