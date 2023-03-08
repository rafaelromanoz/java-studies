import java.util.Scanner;

public class EstruturaRepeticaoWhile {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso máximo da aeronave: ");
    int pesoMaximo = entrada.nextInt();

    int pesoTotalPassageiros = 0;

     // break para a execução e CONTINUE vai para a próxima execução do loop

    while (pesoTotalPassageiros <= pesoMaximo) {
       System.out.printf("Peso do passageiro: ");
       int pesoPassageiro = entrada.nextInt();
       
       pesoTotalPassageiros += pesoPassageiro;
    }

    System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximo);
    System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiros);
    System.out.printf("Situacao da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");
  }
}
