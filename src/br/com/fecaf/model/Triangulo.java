package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //atributos
    private double base, lado1, lado2, area, perimetro, altura;

    //instanciar scanner
    Scanner scanner = new Scanner(System.in);

    //construtor
    public Triangulo(double base, double lado1, double lado2, double altura){
        System.out.println("Criou um novo Tringulo!");
        //Atributos do construtor
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;

    }

    //metodo de cadastro
    public void cadastrarTriangulo (){
        System.out.println("/****************************/");
        System.out.println("/*****     TRIANGULO    *****/");
        System.out.println("/****************************/");
        System.out.println("Informe a Base:               ");
        base = scanner.nextDouble();
        System.out.println("Digite o lado 1 do triangulo: ");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o lado 2 do triangulo: ");
        lado2 = scanner.nextDouble();
        System.out.println("Digite a Altura do triangulo: ");
        altura = scanner.nextDouble();
        System.out.println("******************************");

    }


    //definição de tringulo valido
    public boolean isTriangulo () {

        if (lado1 + base > lado2 && lado1 + lado2 > base && lado2 + base > lado1) {
            System.out.println("É um triangulo valido!");
            return true;
        }

        System.out.println("Não é um triangulo valido!");
        return false;
    }

    public double calcularArea(){
        area = (base * altura) / 2 ;
        return area;
    }

    //calcular perimetro
    public double calcularPerimetro () {
        perimetro = base + lado1 + lado2;
        return perimetro;
    }


    //metodo para definir tipo do tringulo
    public String tipoTriangulo(){
        if(base == lado1 && base == lado2){
            System.out.println("É um tringulo equilatero!");
            return "Equilatero";
        } else if (lado1 == lado2 || lado1 == base || lado2 == base) {
            System.out.println("É um tringulo isoceles!");
            return "Isoceles";
        } else {
            System.out.println("É um tringulo escaleno!");
            return "Escaleno";
        }
    }

    //Ruan - Metodo de verificação de tringulo retangulo.
    //primeiro vamos verificar oque torna um triangulo retangulo.
    //Um tringulo é considerado retangulo quando possui um angulo de 90 graus.
    //E para verificar isso, podemos usar o teorema de pitagoras que diz que um tringulo retangulo possui catetos ao quadrado igual a hipotenusa ao quadrado.
    //Então, podemos dizer que lado1 = cateto1, lado2 = cateto2 e base = hipotenusa.

    public boolean isTringuloRetangulo (){
        double cateto1 = lado1;
        double cateto2 = lado2;
        double hipotenusa = base;

        if (cateto1 * cateto1 + cateto2 * cateto2 == hipotenusa * hipotenusa) {
            System.out.println("É um tringulo retangulo!");
            return true;
        } else {
            System.out.println("Não é um tringulo retangulo!");
            return false;
        }
    }

    //Ruan - Também podemos verificar se o tringulo retangulo se encaixa na
    // - regra do 3,4,5, onde os catetos podem ser 3 e 4 ou multiplos e a hipotenusa deve ser 5 ou multiplo.

    public boolean isTringuloRetangulo345 (){

        //Aqui foi necessario utilizar o if e else if com praticamente com a mesma condição,
        // - pois o cateto1 pode ser 3 ou 4 e o cateto2 pode ser 4 ou 3.
        if (lado1 % 3 == 0 && lado2 % 4 == 0 && base % 5 == 0) {
            System.out.println("É um tringulo retangulo do tipo 3,4,5!");
            return true;
        }else if (lado1 % 4 == 0 && lado2 % 3 == 0 && base % 5 == 0) {
            System.out.println("É um tringulo retangulo do tipo 3,4,5!");
            return true;
        } else {
            System.out.println("Não é um tringulo retangulo do tipo 3,4,5!");
            return false;

        }

    }

    //Metodo para exibir as informaçãoes do triangulo que não avia sido feita
    public void exibir(){
        System.out.println("*** Exibir Triangulo ***");
        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
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
