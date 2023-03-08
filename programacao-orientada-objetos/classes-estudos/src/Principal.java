public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Rafael";
        pessoa1.cpf = "121.500.826-08";
        pessoa1.anoNascimento = 1994;

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 20.000;
        meuCarro.anoFabricacao = 2010;
        meuCarro.proprietario = pessoa1;

        meuCarro.imprimirResumoDepreciacao();
    }
}
