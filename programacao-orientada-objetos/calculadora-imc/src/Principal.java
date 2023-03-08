public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 75;
        IndiceMassaCorporal imc = calculadoraImc.calcular(paciente);

        if (imc.estaComObesidade()) {
            System.out
                    .printf("Paciente com altura de %.2f e peso %.2f" + "está com obesidade",
                            imc.altura,
                            imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }
}
