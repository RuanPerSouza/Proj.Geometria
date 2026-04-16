//encapsulamento a capacidade de privar um atributo para que ele não seja visto de forma publica

        package br.com.fecaf;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import controller.Menu;

public class App {
    public static void main(String[] args) {
        System.out.println("************");
        System.out.println("/*          Geometria         */");
        System.out.println("************");


        Circulo circulo = new Circulo(5);

        circulo.calculeArea();
        circulo.calcularPerimetro();

        Retangulo retangulo = new Retangulo(10, 5);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.isQuadrado();

        Menu menu = new Menu();
        menu.executarMenu();

    }

}