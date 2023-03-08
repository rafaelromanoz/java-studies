public class CalculoArea {

    static double pi = 3.14159265358979323846;
    static void calcularAreaQuadrado(int area) {
        System.out.println(area * area);
    }

    static void calcularAreaCirculo(double raio) {
        System.out.println((raio * raio) * CalculoArea.pi);
    }
}
