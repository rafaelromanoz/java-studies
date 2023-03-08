import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Peso: ");
    int peso = entrada.nextInt();
   
    System.out.print("Altura: ");
    double altura = entrada.nextDouble();
   
    double imc = peso / (altura * altura);
   
    if (imc < 18.5) {
      System.out.println("Abaixo do peso ideal.");
    } else if (imc < 25) {
      System.out.println("Não está abaixo do peso");
    } else {
      System.out.println("Obesidade grau III");
    }

    System.out.println("Fim do programa");
  }
}
