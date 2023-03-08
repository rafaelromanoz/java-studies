public class Teste {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024];

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
        System.out.printf("Total empenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
        System.out.printf("Total disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));
        System.out.printf("Total usada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));

        System.out.println("---");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d /1024d );
    }
}
