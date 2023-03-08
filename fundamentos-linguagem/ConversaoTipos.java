public class ConversaoLongParaInt {
  public static void main(String[] args) {
    long x = 10;
    
    // int y = x; isso não compila
    
    int y = (int) x;
    
    System.out.println(x);
    System.out.println(y);
    
    long a = 930000000000L;
    int b = (int) a;
    System.out.println(a);
    System.out.println(b);
 }
}
