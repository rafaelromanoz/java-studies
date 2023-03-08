import java.util.Scanner;

public class DesafioEstruturaWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int soma = 0;
    while (soma <= 100) {
      System.out.print("Digite um número: ");
      int numeroDigitado = entrada.nextInt();
      
      soma += numeroDigitado;
    }
    System.out.printf("A soma é: %d%n", soma);
  }
}
