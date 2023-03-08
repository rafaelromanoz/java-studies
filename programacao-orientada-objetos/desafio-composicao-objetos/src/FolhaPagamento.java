public class FolhaPagamento {
    Holerite calcularSalario(
            int quantidadeHorasNormais,
            int quantidadeHorasExtras,
            ContratoTrabalho contratoTrabalho
    ) {
        double valorTotalHorasExtras = quantidadeHorasExtras * contratoTrabalho.valorHoraExtra;
        double valorTotalHorasNormais = quantidadeHorasNormais * contratoTrabalho.valorHoraNormal;
        double valorAdicional = contratoTrabalho.possuiFilhos() ? (valorTotalHorasExtras + valorTotalHorasNormais) * 0.10 : 0;
        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorAdicionalFilhos = valorAdicional;
        holerite.valorTotalHorasExtras = valorTotalHorasExtras;
        holerite.valorTotalHorasNormais = valorTotalHorasNormais;
        holerite.calcularValorTotal();
        holerite.imprime();
        return holerite;
    }
}
