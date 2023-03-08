import java.util.Scanner;

public class DesafioOperadoresIgualdadeLogico {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
   
    System.out.print("Ano: ");
    int ano = entrada.nextInt();

    boolean eBissexto = ano % 400 == 0 || ano % 4 == 0;
    System.out.printf("É bissexto: %b%n", eBissexto);
  }
}
