public class PromocaoAritmetica {
  public static void main(String[] args) {
    int x = 10;
    long y = 5;
    long z = x * y;

    //
    
    // sempre atribuir para ponto flutuante ou o maior valor se não não compila
    long a = 10;
    float b = 9.34f;
    float c = a * b;

    int d = 3;
    float f = 2;
    float g = d / f;

    System.out.println(z);
    System.out.println(g);
  }
}
