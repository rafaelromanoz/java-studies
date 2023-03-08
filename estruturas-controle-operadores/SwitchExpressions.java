import java.util.Scanner;

public class SwitchExpressions {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

     // o switch não funciona com LONG
    
    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    int diaSemana = entrada.nextLine();
    
    String horarioFuncionamento = switch (diaSemana) { 
      case "seg" -> {
        if(mes = 12) {
          yield "08:00 às 16:00"
        }
        yield "Fechado"
      };
      case "ter", "qua", "qui", "sex" -> "08:00 as 18:00";
      case "sab", "dom" -> "08:00 às 12:00";
      default -> "Dia inválido";
    };

   System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
  }
}
