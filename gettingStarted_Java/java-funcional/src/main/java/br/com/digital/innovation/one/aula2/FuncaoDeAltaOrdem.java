package br.com.digital.innovation.one.aula2;

public class FuncaoDeAltaOrdem {

    public static void main(String[] args) {

        Calculo soma = (a, b) -> a+b;
        Calculo subtracao = (a, b) -> a-b;
        Calculo multiplicacao = (a, b) -> a*b;
        Calculo divisao = (a, b) -> a/b;
        Calculo resto = (a, b) -> a%b;

        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 1, 3));
        System.out.println(executarOperacao(multiplicacao, 1, 3));
        System.out.println(executarOperacao(divisao, 3, 1));
        System.out.println(executarOperacao(resto, 8, 3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo {
        public int calcular(int a, int b);
}
//POR PARÂMETRO RECEBE OUTRA FUNÇÃO OU QUE ELA RETORNA UMA FUNÇÃO