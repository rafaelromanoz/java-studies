import java.util.Scanner;

public class DesafioEstruturaFor {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;

    for (int i = 1; i < 11; i++) {
      System.out.print("Digite um número: ");
      int numeroDigitado = entrada.nextInt();
      if (numeroDigitado % 2 != 0) {
         System.out.println("Digite um número par");
         continue;
      }
      soma += numeroDigitado;
    }
    System.out.printf("Soma dos números: %d%n", soma);
  }
}
