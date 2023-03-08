public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprime() {
        System.out.printf("Nome: %s%n Quantidade de filhos: %d%n Valor total horas extras: %.2f%n Valor total horas normais: %.2f%n Valor adicional para filhos: %.2f%n Valor TOTAL; %.2f%n", funcionario.nome,
                funcionario.quantidadeFilhos, valorTotalHorasExtras, valorTotalHorasNormais, valorAdicionalFilhos, calcularValorTotal());
    }
}
