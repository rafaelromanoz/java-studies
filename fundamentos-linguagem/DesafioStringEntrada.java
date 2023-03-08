import java.util.Scanner;

public class DesafioStringEntrada {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    System.out.print("Valor hora: ");
    double valorHora = entrada.nextDouble();
    
    System.out.print("Horas trabalhadas: ");
    int horas = entrada.nextInt();

    System.out.print("Valor descontos: ");
    double descontos = entrada.nextDouble();

    double totalSemDescontos = horas * valorHora;
    double totalDevido = totalSemDescontos - descontos;

    System.out.printf("Folha de pagamentos: %s%n %d horas x R$%.2f = R$%.2f%n Descontos: R$%.2f%n Total devido: %.2f%n", nome, horas, valorHora, totalSemDescontos, descontos, totalDevido);
  }
}
