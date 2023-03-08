public class Principal2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.custoEmbalagem = 10;

        Produto.imprimirCustoEmbalagem();
        Produto.imprimirCustoEmbalagem();

        double novoCusto = 10;

        Produto.alterarCustoEmbalagem(novoCusto);
        Produto.alterarCustoEmbalagem(novoCusto);
    }
}
