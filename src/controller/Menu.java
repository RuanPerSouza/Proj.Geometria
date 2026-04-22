package controller;

import br.com.fecaf.model.Circulo;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    //Objeto Circulo
    private Circulo circulo = null;
    //Objeto Retangulo
    private Retangulo retangulo = null;
    //Objeto Triangulo
    private Triangulo triangulo = null;


    public void executarMenu () {

        boolean continuar = true;

        do {
            System.out.println("/************************/");
            System.out.println("/*****     MENU     *****/");
            System.out.println("/* 1 - Circulo            ");
            System.out.println("/* 2 - Retangulo          ");
            System.out.println("/* 3 - Triangulo          ");
            System.out.println("/* 4 - Sair               ");
            System.out.println("/************************/");

            System.out.println("Escolha uma opção: ");

            String userOption = scanner.nextLine();
            String userOptionMin = userOption.toLowerCase();

            switch (userOption) {
                case "circulo":

                    boolean exitCirculo = false;

                    while (!exitCirculo) {
                        System.out.println("/*************************/");
                        System.out.println("/*****     CIRCULO   *****/");
                        System.out.println("/* 1 - Cadastrar         */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 - Calcular Perimetro*/");
                        System.out.println("/* 4 - Exibir            */");
                        System.out.println("/* 5 - Voltar            */");
                        System.out.println("/*************************/");

                        System.out.println("Escolha uma opção: ");

                        int userOptionCirculo = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner

                        switch (userOptionCirculo) {
                            case 1:
                                System.out.println("Informe o valor do Raio: ");
                                double raio = scanner.nextDouble();

                                //Instanciar um Circulo
                                this.circulo = new Circulo(raio);
                                break;
                            case 2:
                                System.out.println("*** Calcular area do circulo ***");
                                this.circulo.calculeArea();
                                break;
                            case 3:
                                System.out.println("*** Calcular perimetro do circulo ***");
                                this.circulo.calcularPerimetro();
                                break;
                            case 4:
                                System.out.println("*** Exibir circulo ***");
                                this.circulo.exibir();
                                break;
                            case 5:
                                System.out.println("*** Voltando para o menu principal ***");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("*** Escolha uma opção valida ***");
                        }

                    }

                    break;
                case "retangulo":

                    boolean exitRetangulo = false;

                    while (!exitRetangulo) {
                        System.out.println("/*************************/");
                        System.out.println("/*****   RETANGULO   *****/");
                        System.out.println("/* 1 - Cadastrar         */");
                        System.out.println("/* 2 - Calcular Area     */");
                        System.out.println("/* 3 - Calcular Perimetro*/");
                        System.out.println("/* 4 - Verificar se é quadrado*/");
                        System.out.println("/* 5 - Exibir            */");
                        System.out.println("/* 6 - Voltar            */");
                        System.out.println("/*************************/");

                        System.out.println("Escolha uma opção: ");

                        int userOptionRetangulo = scanner.nextInt();
                        scanner.nextLine();

                        switch (userOptionRetangulo) {
                            case 1:
                                System.out.println("Informe o valor do lado 1: ");
                                double lado1 = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Informe o valor do lado 2: ");
                                double lado2 = scanner.nextDouble();

                                //Instanciar um Retangulo
                                this.retangulo = new Retangulo(lado1, lado2);
                                break;
                            case 2:
                                System.out.println("*** Calcular area do retangulo ***");
                                this.retangulo.calcularArea();
                                break;
                            case 3:
                                System.out.println("*** Calcular perimetro do retangulo ***");
                                this.retangulo.calcularPerimetro();
                                break;
                            case 4:
                                System.out.println("*** Verificar se é quadrado ***");
                                this.retangulo.isQuadrado();
                                break;
                            case 5:
                                System.out.println("*** Exibir retangulo ***");
                                this.retangulo.exibir();
                                break;
                            case 6:
                                System.out.println("*** Voltando para o menu principal *** ");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");
                        }

                    }
                    break;
                case "triangulo":

                    boolean exitTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/******************************************/");
                        System.out.println("/*****            TRIANGULO           *****/");
                        System.out.println("/******************************************/");
                        System.out.println("/* 1 - Cadastrar                          */");
                        System.out.println("/* 2 - Verificar se é um triangulo valido */");
                        System.out.println("/* 3 - Calcular Area                      */");
                        System.out.println("/* 4 - Calcular Perimetro                 */");
                        System.out.println("/* 5 - Verificar tipo do triangulo        */");
                        System.out.println("/* 6 - Exibir triangulo                   */");
                        System.out.println("/* 7 - Verificar 3-4-5                    */");
                        System.out.println("/* 8 - Voltar                             */");
                        System.out.println("/******************************************/");

                        int userOptionTriangulo = scanner.nextInt();
                        scanner.nextLine();

                        switch (userOptionTriangulo) {
                            case 1:
                                System.out.println("Informe o valor do lado 1: ");
                                double lado1 = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Informe o valor do lado 2: ");
                                double lado2 = scanner.nextDouble();

                                System.out.println("Informe o valor da base: ");
                                double base = scanner.nextDouble();

                                //Instanciar um Triangulo
                                this.triangulo = new Triangulo (base, lado1, lado2);
                                break;
                            case 2:
                            System.out.println("*** Verificar se é um triagulo Valido ***");
                            this.triangulo.isTriangulo();
                                break;
                            case 3:
                                System.out.println("*** Calcular area do triangulo ***");
                                this.triangulo.calcularArea();
                                break;
                            case 4:
                                System.out.println("*** Calcular perimetro do triangulo ***");
                                this.triangulo.calcularPerimetro();
                                break;
                            case 5:
                                System.out.println("*** Verificar tipo do triangulo ***");
                                this.triangulo.tipoTriangulo();
                                break;
                            case 6:
                                this.triangulo.exibir();
                                break;
                            case 7:
                                this.triangulo.isTringuloRetangulo345();
                                break;
                            case 8:
                                System.out.println("*** Voltando para o menu principal *** ");
                                exitTriangulo = true;
                                break;

                        }

                    }


                    }


            }
            while (continuar);


        }
    }





