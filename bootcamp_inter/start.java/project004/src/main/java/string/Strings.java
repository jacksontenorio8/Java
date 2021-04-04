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
        System.out.println("Quantidade = " + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower " + string.toLowerCase());
        System.out.println("Upper " + string.toUpperCase());
        System.out.println("Contém J? " + string.contains("J"));
        System.out.println("Contém Y? " + string.contains("X"));
        System.out.println("Replace " + string.replace("a", "$"));
        System.out.println("Equals? " + string.equals(" Minha String"));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));
        System.out.println("Substring(1,6) = " + string.substring(1, 6));

    }
}
