package Tabuada;

import java.util.Scanner;

public class Menu {

    static Scanner scan = new Scanner(System.in);

    static int resp;

    public Menu() {

        do {

            System.out.println("--------------------- MENU ---------------------\n");
            System.out.println("Digite 1 para a tabuada de ADIÇÃO");
            System.out.println("Digite 2 para a tabuada de SUBTRAÇÃO");
            System.out.println("Digite 3 para a tabuada de MULTIPLICAÇÃO");
            System.out.println("Digite 4 para a tabuada de DIVISÃO");
            System.out.println("Digite uma opção a seguir, para ser exibida uma tabuada da operação correspondente:");
            resp = scan.nextInt();

            switch (resp) {

                case 1:
                    // ADIÇÃO

                    Adicao adicao = new Adicao();

                    break;

                case 2:
                    // SUBTRAÇÃO

                    Subtracao subtracao = new Subtracao();

                    break;

                case 3:
                    // MULTIPLICAÇÃO

                    Multiplicacao multiplicacao = new Multiplicacao();

                    break;

                case 4:
                    // DIVISÃO

                    Divisao divisao = new Divisao();

                    break;

                // SAIR DO PROGRAMA
                case 5:

                    System.out.println("----------------------- SAINDO DO PROGRAMA -----------------------");

                    break;

                default:

                    System.out
                            .println("----------------------- VOCÊ DIGITOU UM VALOR INVÁLIDO -----------------------");

                    break;

            }

        } while (resp != 6);
    }
}
