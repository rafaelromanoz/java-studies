public class Principal {
    public static void main(String[] args) {
        String[][] cidades = new String[3][3];
        cidades[0][0] = "Uberlândia";
        cidades[0][1] = "Uberaba";
        cidades[0][2] = "Belo Horizonte";


        cidades[1][0] = "São Paulo";
        cidades[1][1] = "Ribeirão Preto";

        cidades[2][0] = "Fortaleza";

        for (int i = 0; i < cidades.length; i++) {
            for (int j = 0; j < cidades[i].length; j++) {
                System.out.printf("[%d][%d] = %s%n", i, j, cidades[i][j]);
            }
        }
    }
}
