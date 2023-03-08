import java.util.Scanner;

public class DesafioEstruturaForIntermediario {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();
        scanner.close();
        
        if(numero <= 1) {
            System.out.println(numero + " não é um número primo.");
            return;
        }
        
        boolean primo = true;
        for(int i = 2; i <= numero/2; i++) {
            if(numero % i == 0) {
                primo = false;
                break;
            }
        }
        
        if(primo)
            System.out.println(numero + " é um número primo.");
        else
            System.out.println(numero + " não é um número primo.");
    }
  }
}
