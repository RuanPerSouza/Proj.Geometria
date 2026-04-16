package controller;

import br.com.fecaf.model.Circulo;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private Circulo circulo = null;
    private Retangulo retangulo = null;


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

            String userOption = scanner.nextLine();

            String useroption = userOption.toLowerCase(Locale.ROOT);

            switch (userOption) {
                case "circulo":
                    boolean exitCirculo = false;
                    while (!exitCirculo) {
                        System.out.println("/***********************/");
                        System.out.println("/*****   CIRCULO   *****/");
                        System.out.println("/* 1 - Cadastrar         ");
                        System.out.println("/* 2 - Calcular Area     ");
                        System.out.println("/* 3 - Calcular Perimetro");
                        System.out.println("/* 4 - Exibir            ");
                        System.out.println("/* 5 - Voltar            ");
                        System.out.println("/************************/");

                        int userOptionCirculo = scanner.nextInt();
                        scanner.nextLine(); // Limpar o buffer do scanner]

                        switch (userOptionCirculo) {
                            case 1:
                                this.circulo = new Circulo(10);
                                break;
                            case 2:
                                System.out.println("*** Calcular area do circulo ***");
                                this.circulo.calculeArea();
                                break;
                            case 3:
                                System.out.println("Calcular perimetro do circulo");
                                this.circulo.calcularPerimetro();
                                break;
                            case 4:
                                System.out.println("Exibir circulo");
                                this.circulo.exibir();
                                break;
                            case 5:
                                System.out.println("Voltando para o menu principal");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");
                        }

                    }

                    break;
                case "retangulo":
                    boolean exitRetangulo = false;
                    while (!exitRetangulo) {
                        System.out.println("/***********************/");
                        System.out.println("/*****  RETANGULO  *****/");
                        System.out.println("/* 1 - Cadastrar         ");
                        System.out.println("/* 2 - Calcular Area     ");
                        System.out.println("/* 3 - Calcular Perimetro");
                        System.out.println("/* 4 - Verificar se é quadrado");
                        System.out.println("/* 5 - Exibir            ");
                        System.out.println("/* 6 - Voltar            ");
                        System.out.println("/************************/");

                        int userOptionRetangulo = scanner.nextInt();
                        scanner.nextLine();

                        switch (userOptionRetangulo) {
                            case 1:
                                this.retangulo = new Retangulo(10, 5);
                                break;
                            case 2:
                                System.out.println("*** Calcular area do retangulo ***");
                                this.retangulo.calcularArea();
                                break;
                            case 3:
                                System.out.println("Calcular perimetro do retangulo");
                                this.retangulo.calcularPerimetro();
                                break;
                            case 4:
                                System.out.println("Verificar se é quadrado");
                                this.retangulo.isQuadrado();
                                break;
                            case 5:
                                System.out.println("Exibir retangulo");
                                this.retangulo.exibir();
                                break;
                            case 6:
                                System.out.println("Voltando para o menu principal");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");
                        }

                    }
                        break;
                        case "triangulo":
                            boolean exitTringulo = false;
                            while (!exitTringulo) {
                                System.out.println("/***********************/");
                                System.out.println("/*****  TRIANGULO  *****/");
                                System.out.println("/* 1 - Cadastrar         ");
                                System.out.println("/* 2 - Verificar se é triangulo");
                            break;
                        case "sair":
                            System.out.println("Saindo... ");
                            continuar = false;
                            break;
                        default:
                            System.out.println("Escolha uma opção valida");

                    }


            }
            while (continuar);


        }
    }


