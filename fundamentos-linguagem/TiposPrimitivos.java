public class TiposPrimitivos {
  public static void main(String[] args) {
    boolean compraAprovada = true;
    
    int quantidadeEstoque = 10;
    int quantidadePedidoCompra = 15;
    
    // boolean
    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
    System.out.println("Estoque suficiente: " + estoqueSuficiente);

    // char possui um cacacter é necessário aspas simples as aspas duplas são entendidas como frase
  
    char inicialNome = 'T';
    System.out.println("Inicial do nome: " + inicialNome);

    // byte é possivel colocar numeros até 127
    byte idade = 127;

    // short é possível colocar numeros até 32767
    short quantidadePessoas = 32767;

    // int pode se colocar um underscore para separar milhares ou outras coisas
    // o valor máximo de int é 2147483648
    int populacaoUberlandia = 699_097;

    // long é para números bem maiores;
    // para o java interpretar como tipo long é necessário colocar um L no fim
    long populacaoAreado = 44545445551445L;
   
    // NÃO USAR FLOAT OU DOUBLE PARA DINHEIRO OU VALORES QUE PRECISEM DE MUITA PRECISÃO
    // double armazena números reais tipo 1.2, 20.5
    double peso = 84.9;

    // é necessário colocar um f pois de forma implicita é um double
    float taxa = 1_294.93f;
 }
}
