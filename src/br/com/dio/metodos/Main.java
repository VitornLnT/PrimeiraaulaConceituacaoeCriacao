package br.com.dio.metodos;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercicio calculadora");
        CalculadoraJava.soma(3, 6);
        CalculadoraJava.subtracao(9, 1.8);
        CalculadoraJava.multiplicacao(7, 8);
        CalculadoraJava.divisao(5, 2.5);

                //mensagem

        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        System.out.println("Exercício emprestimo.");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
