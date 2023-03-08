public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.quantidadeFilhos = 2;
        funcionario.nome = "Rafael";
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 25.00;
        contratoTrabalho.valorHoraExtra = 32.00;
        Holerite holerite = folhaPagamento.calcularSalario(20, 40, contratoTrabalho);
        holerite.imprime();
    }
}
