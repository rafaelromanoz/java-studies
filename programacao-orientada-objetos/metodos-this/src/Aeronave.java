public class Aeronave {
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }

    void reservarAssentos(int numerosAssentos) {
        if (ativo) {
           assentosReservados += numerosAssentos;
        } else {
            System.out.println("Aeronave desativada, Assentos não reservados");
        }
    }
}
