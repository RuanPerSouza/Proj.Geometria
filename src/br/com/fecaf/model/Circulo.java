package br.com.fecaf.model;

public class Circulo {
    //Atribulos
    private double raio, diametro, area, perimetro;

    //Calcular a Area do circulo
    public double calculeArea (){
        area = 3.14159 * raio * raio;
        area = 3.14159 * Math.pow(raio, 2);
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }
    // Exibir dados do circulo
    public void exibir (){
        System.out.println("*** Dados do Circulo ***");
        System.out.println("Raio: " + raio);
        System.out.println("Diametro: " + perimetro);
        System.out.println("Area: " + area);
        System.out.println("************************");

    }

    public double calcularPerimetro (){
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    //Isso é un construtor
    public Circulo (double raio){
        System.out.println("Criou um novo Circulo");
        this.raio = raio;
    }



    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
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
