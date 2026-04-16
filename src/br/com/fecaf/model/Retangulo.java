package br.com.fecaf.model;

import org.w3c.dom.ls.LSOutput;

public class Retangulo {

    //criar Atributos
    private double lado1, lado2, area, perimetro;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Calcular a Area
    public double calcularArea (){
        area = lado1 * lado2;
        return area;
    }

    //Exibir os dados do retangulo
    public void exibir (){
        System.out.println("*** Dados do Retangulo ***");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("************************");
    }


    //Calcular o perimetro
    public double calcularPerimetro (){
        perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;
    }

    //Quadrado (Retangulo especial)
    public boolean isQuadrado (){
        if (lado1 == lado2){
            System.out.println("É um quadrado!");
            return true;
        }else {
            System.out.println("Não é quadrado!");
            return false;
        }
    }


    //Getter and Setter

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
