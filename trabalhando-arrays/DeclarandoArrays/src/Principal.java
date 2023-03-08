import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        double media = Calculadora.calcularMedia(notas);

        // transforma o array em um string
        String notasEmString = Arrays.toString(notas);

        Arrays.sort(notas);

        System.out.println(notasEmString);

        System.out.printf("A média é: %.2f%n", media);
    }
}
