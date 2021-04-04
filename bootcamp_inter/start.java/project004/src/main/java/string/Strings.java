package string;

public class Strings {

    public static void main(String[] args) {

        var nome = "Jackson";
        var sobreNome = "Tenorio";
        final var nomeCompleto = nome +" " + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        var string = new String(" Minha String");

        System.out.println("Char na posição : " + string.charAt(5));
        System.out.println("Quantidade=" + string.length());
        
    }
}
