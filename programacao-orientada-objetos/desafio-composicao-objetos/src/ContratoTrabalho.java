public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean possuiFilhos() {
        return funcionario.quantidadeFilhos >= 1;
    }
}
