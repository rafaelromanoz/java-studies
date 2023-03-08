import java.util.Scanner;

public class DesafioEstruturaWhileIntermediario {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
    int numero = entrada.nextInt();

    int numeroInvertido = 0;

    while (numero > 0) {
      int digito = numero % 10;
      numeroInvertido = numeroInvertido * 10 + digito;
      numero /= 10;
    }
    System.out.printf("O número invertido é: %d%n", numeroInvertido);
  }
}
