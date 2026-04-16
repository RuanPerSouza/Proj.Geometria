package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    //atributos
    private double base, lado1, lado2, area, perimetro, altura;

    //instanciar scanner
    Scanner scanner = new Scanner(System.in);

    //construtor
    public Triangulo(){
        System.out.println("Criou um novo Tringulo!");

    }

    //metodo de cadastro
    public void cadastrarTriangulo (){
        System.out.println("/*************************/");
        System.out.println("/*****   TRIANGULO   *****/");
        System.out.println("/*************************/");
        System.out.println("Informe a base:            ");
        base = scanner.nextDouble();
        System.out.println("Digite o lado 1 do triangulo: ");
        lado1 = scanner.nextDouble();
        System.out.println("Digite o lado 2 do triangulo: ");
        lado2 = scanner.nextDouble();
        System.out.println("Digite a altura do tringulo:  ");
        altura = scanner.nextDouble();
        System.out.println("/*****************************/");
    }

    //definição de tringulo valido
    public boolean isTringulo (){
        if (base < lado1 + lado2 && lado1 < base + lado2 && lado2 < base + lado1){
            System.out.println("É um triangulo valido!");
            return true;
        }else {
            System.out.println("Não é um triangulo valido!");
            return false;
        }
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
