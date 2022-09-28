package br.com.dio.Rotornos;

public class Main {

    public static void main(String[] args) {

        //Quadrilatero
        System.out.println("Exercício Quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retangulo: " + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do trapezio: " + areaTrapezio);
        double areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Área do losango: " + areaLosango);
    }
}