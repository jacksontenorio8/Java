import one.innovation.digital.pessoa.Pessoa;

public class Programa {


    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa ("Jackson", 1.68, 1.77);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }
}
