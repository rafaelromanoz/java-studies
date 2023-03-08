import java.util.Scanner;

public class DesafioEstruturaDoWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int somaImpares = 0;
    int somaPares = 0;
    boolean querContinuar = false;
    do {
    System.out.print("Digite um número: ");
    int numero = entrada.nextInt();
    System.out.print("Quer continuar?: ");
    querContinuar = entrada.nextBoolean();
    if (querContinuar) {
      querContinuar = false;
    } else {
      querContinuar = true;
    }
    if (numero % 2 == 0) {
      somaPares += numero;
    } else {
      somaImpares += numero;
    }
    } while (querContinuar);
   System.out.printf("Soma pares: %d%n Soma impares: %d%n", somaPares, somaImpares);
  }
}
