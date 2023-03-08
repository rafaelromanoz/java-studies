public class ConversaoTipos {
  public static void main(String[] args) {
    long x = 10;
    
    // int y = x; isso não compila
    
    int y = (int) x;
    
    System.out.println(x);
    System.out.println(y);
    
    // assim não cabe então perde dados
    long a = 930000000000L;
    int b = (int) a;
    System.out.println(a);
    System.out.println(b);

    // tipo int para long
    // isso funciona
    int c = 102344;
    long d = c;

    // double para float é necessário fazer o cast
    double peso1 = 20.5;
    float peso2 = (float) peso1;

    // float para double
    float taxa1 = 934.5f;
    double taxa2 = taxa1;

    // double para int
    double largura = 100;
    // int tamanho = largura;
    int tamanho = (int) largura;
 }
}
